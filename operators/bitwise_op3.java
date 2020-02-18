class Output 
{
    public static void main(String args[]) 
    {    
         int a = 1;
         int b = 2;
         int c = 3;
         a |= 4;
         b >>= 1;
         c <<= 1;
         a ^= c;
         System.out.println(a + " " + b + " " + c);
    } 
}
//3 1 6
