
public class A
{
    static int i = 10, j = 20;
 
    int m = 30, n = 40;
 
    public static void main(String[] args)
    {
        A a1 = new A();
 
        A a2 = new A();
 
        a1.i = 100;
 
        System.out.println(a2.i);
 
        a2.j = 200;
 
        System.out.println(a1.j);
 
        a1.m = 300;
 
        System.out.println(a2.m);
 
        a2.n = 400;
 
        System.out.println(a1.n);
    }
}
//output
100
200
30
40
