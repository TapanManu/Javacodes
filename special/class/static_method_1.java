class A
{
    static int i;
 
    static
    {
        i = 100;
 
        System.out.println(1);
    }
 
    static void staticMethod()
    {
        System.out.println(i);
 
        System.out.println(2);
    }
}
 
public class B
{
    static
    {
        System.out.println(3);
    }
 
    public static void main(String[] args)
    {
        System.out.println(4);
 
        System.out.println(A.i);
 
        A.staticMethod();
    }
}
//output
3
4
1
100
100
2
