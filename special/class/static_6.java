public class A
{
    static
    {
        i = 30;
    }
 
    static int i = 20;
 
    static
    {
        i = 10;
    }
 
    public static void main(String[] args)
    {
        System.out.println(A.i);
    }
}
//output
10
