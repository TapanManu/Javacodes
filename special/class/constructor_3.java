
public class A
{
    int i;
 
    {
        System.out.println("IIB-1");
 
        i = 100;
    }
 
    {
        System.out.println("IIB-2");
 
        System.out.println(i);
 
        i = 200;
    }
 
    public static void main(String[] args)
    {
        System.out.println("main");
 
        A a = new A();
 
        System.out.println(a.i);
    }
}
//output
main
IIB-1
IIB-2
100
200
