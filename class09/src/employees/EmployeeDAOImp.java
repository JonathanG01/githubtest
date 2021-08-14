package employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImp implements EmployeeDAO {
	//private static Statement stm = null;
	Connection conn = null;
	public static PreparedStatement ps = null;
	
	public EmployeeDAOImp() throws SQLException {
	this.conn = ConnectionFactory.getConnection();
	}
	

	@Override
	public void addEmployee(Employee emp) {
		String q = "insert into employee (name, email) values (?,?)"; //id is auto_increment, no need to pass.
		try {
			PreparedStatement ps = conn.prepareStatement(q);
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getEmail());
			
			
			int count = ps.executeUpdate();
			if (count>0) {System.out.println("employee submitted");
			} else {System.out.println("error");}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
				}

	@Override
	public void updateEmployee(Employee emp) {
		String q = "update employee set name = ?, email = ? where id =?";
		try {
			PreparedStatement ps = conn.prepareStatement(q);
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getEmail());
			ps.setInt(3, emp.getId());
			
			int count = ps.executeUpdate();
			if (count>0) {System.out.println("employee submitted");
			} else {System.out.println("error");}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
				
	}

	@Override
	public void deleteEmployee(int id) {
		String q = "delete from employee where id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(q);
			ps.setInt(1, id);
			int count = ps.executeUpdate();
			if (count>0) {
				System.out.println("employe deleted");
			} else {System.out.println("error");}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee employeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}//this will implement interface

}
;