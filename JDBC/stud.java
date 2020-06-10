import java.sql.*; 
import java.util.*; 
class Main 
{ 
    public static void main(String a[]) 
    { 
        //Creating the connection 
        String url = "jdbc:mysql://localhost/student"; 
        String user = "root"; 
        String pass = "your password"; 
  
        //Entering the data 
        Scanner k = new Scanner(System.in); 
        System.out.println("enter name"); 
        String name = k.next(); 
        System.out.println("enter roll no"); 
        int roll = k.nextInt(); 
        System.out.println("enter class"); 
        String cls =  k.next(); 
  
        //Inserting data using SQL query 
        String sql = "insert into stud values("+roll+",'"+name+"','"+cls+"')"; 
        Connection con=null; 
        try
        { 
           Class.forName("com.mysql.jdbc.Driver");  
  
            //Reference to connection interface 
            con = DriverManager.getConnection(url,user,pass); 
  
            Statement st = con.createStatement(); 
            int m = st.executeUpdate(sql); 
            if (m == 1) 
                System.out.println("inserted successfully : "+sql); 
            else
                System.out.println("insertion failed"); 
            con.close(); 
        } 
        catch(Exception ex) 
        { 
            System.err.println(ex); 
        } 
    } 
} 
