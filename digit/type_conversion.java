class conversion 
        {
            public static void main(String args[]) 
            {
                double a = 295.04;
                int  b = 300;
                byte c = (byte) a;
                byte d = (byte) b;
                System.out.println(c + " "  + d);
            } 
        }
        
        Explanation: Type casting a larger variable into a smaller variable results in modulo of larger variable by range of
        smaller variable. b contains 300 which is larger than byte’s range i:e -128 to 127 hence d contains
        300 modulo 256 i:e 44.
output:

$ javac conversion.java
$ java conversion
39 44
