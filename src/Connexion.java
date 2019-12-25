import java.sql.PreparedStatement;
import java.sql.*;

public class Connexion {
	
	public Connection getConnexion(){
		 System.out.println("-------- Oracle JDBC Connection Testing ------");
		 
	     try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         } 
	     
	     catch (ClassNotFoundException e) {
	         System.out.println("Where is your Oracle JDBC Driver?");
	         e.printStackTrace();           
	     }

	     System.out.println("Oracle JDBC Driver Registered!");

	     Connection connection = null;

	     try {
	    	 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "medmaher", "123456789");
	    	 System.out.println("connected");
	         return connection;         
	   } 
	     
	     catch (SQLException e) {
	         System.out.println("Connection Failed! Check output console");
	         e.printStackTrace();
	         return null;
	     }
   
	}	
}