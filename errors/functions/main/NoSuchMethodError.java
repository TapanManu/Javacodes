        class c 
        {    
           public void main( String[] args ) 
            {  
                System.out.println( "Hello" + args[0] ); 
            } 
        }
        
        //Explanation: A runtime error will occur owning to the main method of the code fragment not being declared static.
//Output:

//$ javac c.java
//Exception in thread "main" java.lang.NoSuchMethodError: main
