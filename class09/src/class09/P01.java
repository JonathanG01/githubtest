package class09;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P01 {
	
	    public static void main (String[] args) throws SQLException {
	     //step1-load driver(no need after a certain java)
	        //step2-create connection
	        String host = "jdbc:mysql://localhost:3306/";
	        String database ="revature";
	        //"jdbc:mysql://localhost:3306/revature";
	       // String connectString = host + database;
	        //String username = "root", pw = "root";

	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature");
	        //step3-create statement object;
	        Statement st = conn.createStatement();
	        //step4 execute queries;
	        //demo01
	        //-------------------------------------------------------------------------------------------------------------
	        //String query = "create table employee (id integer primary key auto_increment, name char (20), email char(20))";
	         //       st.executeUpdate(query);
	        //System.out.println("table created"); //END OF DEMO01-------------------------------------
	        
	        //DEMO02 ADD INTO TABLES
	 /*   	String query = "insert into employee (name,email) values (?,?)";
	    	//get prep statement
	    	PreparedStatement ps = conn.prepareStatement(query);
	    	//set values to query
	    	ps.setString(1, "Jonathan");
	    	ps.setString(2, "j@gmail.com");
	    	//exe query
	    	int rowAffected = ps.executeUpdate();
	    	System.out.println(rowAffected); //end of demo 2*/
	        
//	       Demo 3: Update data of our table
	       /* String query = "update employee set name = ?, email = ? where id = ?";
	        PreparedStatement ps02 = conn.prepareStatement(query);
	        ps02.setString(1, "Eliza");
	        ps02.setString(2, "e@gmail.com");
	        ps02.setInt(3, 1);
	        int rowAffected = ps02.executeUpdate();
	        System.out.println("("+rowAffected+") rows affected");*/
	        
// 		Demo 4: delete data from our table;
	        /*String Q = "delete from employee where id =?";
	        PreparedStatement ps03 = conn.prepareStatement(Q);
	        ps03.setInt(1, 1);
	        int rowAffected = ps03.executeUpdate();
	        System.out.println(rowAffected);*/
	        
//		Demo 5: read data from table;
	       /* String q = "select * from employee";
	        ResultSet rs = statement.executerQuery(q);
	             
	        while(rs.next()) {
	        	int id = rs.getInt(1);
	        	String name = rs.getString(2);
	        	String m = rs.getString(3);
	        	
	        	System.out.println("name ="+name+ ", id =" +id+", email ="+m);
	        }*/
	       /* String query2 = "select * from employee";
	        Statement stmt = conn.createStatement();  //important
	       	ResultSet resultSet =  stmt.executeQuery(query2);

	        while(resultSet.next()){
	            int id = resultSet.getInt(1);
	            String name = resultSet.getString(2);
	            String email = resultSet.getString(3);

	            System.out.println("Id = "+ id+ ", Name = "+ name+", Email: "+ email);

	        }*/
	        
	        
	        if (conn.isClosed()) {
	        	System.out.println("closed conn");
	        } else {
	        	System.out.println("conn open");
	        }

	    }
	}

