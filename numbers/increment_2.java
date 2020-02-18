class Output 
    {
        public static void main(String args[]) 
        {    
             int a = 1;
             int b = 2;
             int c;
             int d;
             c = ++b;
             d = a++;
             c++;
             b++;
             ++a;
             System.out.println(a + " " + b + " " + c);
        } 
    }
    //output 3 4 4
