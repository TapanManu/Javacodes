class conversion 
        {
            public static void main(String args[]) 
            {
                double a = 295.04;
                int  b = 300;
                int c = (int) (a%2); //remainder of a/2 or 295/2=147  or 147*2+1=295  //hence ans 1
                byte d = (byte) b;
                System.out.println(c + " "  + d);
            } 
        }
