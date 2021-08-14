package Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UsersDAOImp implements UsersDAO {
	private static Statement stm = null;
	Connection conn = null;
	public static PreparedStatement ps = null;
	
	public UsersDAOImp() throws SQLException {
	this.conn = ConnectionFactory02.getConnection();
	}
	

	@Override
	public void addUsers(Users users) {
		String q = "insert into users (fname,lname, balance, email) values (?,?,?,?)"; //id is auto_increment, no need to pass.
		//insert into users (jonathan,gomez,10.00,j@gmail.com)
		try {
			PreparedStatement ps = conn.prepareStatement(q);
			ps.setString(1, users.getFname());
			ps.setString(2, users.getLname());
			ps.setDouble(3, users.getBalance());
			ps.setString(4, users.getEmail());
						
			int count = ps.executeUpdate();
			if (count>0) {System.out.println("User submitted");
			} else {System.out.println("error");}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
				}


	@Override
	public void deleteUsers(int id) {
		String q = "delete from users where id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(q);
			ps.setInt(1, id);
			int count = ps.executeUpdate();
			if (count>0) {
				System.out.println("User deleted");
			} else {System.out.println("error");}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	//public Users usersById(int id) {
		// TODO Auto-generated method stub
	//	return null;}
	//this will implement interface


	@Override
	public void withdraw(Users user, double amount, double balance) {
		
			if (amount > 0) {balance += amount;} else {System.out.println("error");}
			double updatedAmount = 0;
		    String q = "select balance from users where email = ?";
		    String q01 = "update users set balance = ? where email = ?";
		    		
		 try {
		    PreparedStatement ps = conn.prepareStatement(q);
		    ps.setString(1, user.getEmail());
		    ResultSet rs = ps.executeQuery();
		    while (rs.next()) {
		        updatedAmount = rs.getDouble(1);
		        double newAmount = balance + amount;
		        PreparedStatement preparedStatement1 = conn.prepareStatement(q01);
		        preparedStatement1.setDouble(1, newAmount);
		       
					preparedStatement1.setDouble(2, balance );
					int count = preparedStatement1.executeUpdate();
		        if (count > 0) {
		            System.out.println("your money has been deposited successfully");
		        }
		        }
		    }catch (SQLException e) {
					
					e.printStackTrace();
				}

		
	}


	@Override
	public void deposit(Users user, double amount, double balance) {//update amount on checkings and withdraw amount requested
	if (amount < 0) {balance -= amount;} else {System.out.println("error");}
	double updatedAmount = 0;
    String q = "select balance from users where email = ?";
    String q01 = "update users set balance = ? where email = ?";
    		
 try {
    PreparedStatement ps = conn.prepareStatement(q);
    ps.setString(1, user.getEmail());
    ResultSet rs = ps.executeQuery();
    while (rs.next()) {
        updatedAmount = rs.getDouble(1);
        double newAmount = balance - amount;
        PreparedStatement preparedStatement1 = conn.prepareStatement(q01);
        preparedStatement1.setDouble(1, newAmount);
       
			preparedStatement1.setDouble(2, balance );
			int count = preparedStatement1.executeUpdate();
        if (count > 0) {
            System.out.println("your money has been withdrawn successfully");
        }
        }
    }catch (SQLException e) {
			
			e.printStackTrace();
		}
        
}

	
	@Override
	public void updateUsers(Users user) {
					
	}
	

}
;