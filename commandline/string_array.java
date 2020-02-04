        class main_arguments 
        {
            public static void main(String [] args) 
            {
                String [][] argument = new String[2][2];
                int x;
                argument[0] = args;
                x = argument[0].length;
                for (int y = 0; y < x; y++) 
                    System.out.print(" " + argument[0][y]);              
            }
        }
        
        //Explanation: In argument[0] = args;, the reference variable arg[0], 
     //   which was referring to an array with two elements, is reassigned to an array (args) with three elements.
//Output:

//$ javac main_arguments.java
//$ java main_arguments
//1 2 3
