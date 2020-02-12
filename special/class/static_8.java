
public class A
{
    static
    {
        System.out.println('A');
    }
 
    static
    {
        System.out.println('B');
    }
 
    public A()
    {
        System.out.println('C');
    }
 
    public static void main(String[] args)
    {
        System.out.println('D');
 
        A a = new A();
    }
}
//output
A
B
D
C

