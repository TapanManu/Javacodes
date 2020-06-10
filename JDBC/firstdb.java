import java.sql.Connection;
 import java.sql.DriverManager;
  class JDBCTest { 
  	private static final String url = "jdbc:mysql://localhost";
  	 private static final String user = "root";
  	  private static final String password = "your password";
  	   public static void main(String args[])
  	    { try 
  	    	{ 
  	    		Connection con = DriverManager.getConnection(url, user, password); 
  	    		System.out.println("Success"); 
  	    	} 
         catch (Exception e) 
         { e.printStackTrace(); 
         } 
     } 
 }
