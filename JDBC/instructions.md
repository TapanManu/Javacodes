## Instructions before doing JDBC in ubuntu (assumed mysql is already there!)

1. Install the JDBC Driver by

   sudo apt-get install libmysql-java

2. specify the class path in the terminal (otherwise classnotFound error occurs)

   export CLASSPATH=$CLASSPATH:/usr/share/java/mysqlonnector-java.jar
   
3. within java program specify the below code to register the driver within the code

   Class.forName("com.mysql.jdbc.Driver");  
   
   within a try-catch block to avoid sqlexception errors 
   
4. then establish connectivity

   con = DriverManager.getConnection(url,user,pass); 
