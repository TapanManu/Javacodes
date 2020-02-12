
public class A
{
    int i = 111;
 
    static int j = 222;
 
    static void methodOne(int i, int j)
    {
        System.out.println(i);
 
        System.out.println(j);
    }
 
    public static void main(String[] args)
    {
        methodOne(333, 444);
    }
}
//output
333
444
