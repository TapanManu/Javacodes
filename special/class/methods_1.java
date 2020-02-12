public class A
{
    static void methodOne()
    {
        System.out.println("A");
    }
 
    void methodTwo()
    {
        System.out.println("B");
 
        methodOne();
    }
 
    public static void main(String[] args)
    {
        System.out.println("C");
 
        new A().methodTwo();
    }
}
//output
C
B
A
