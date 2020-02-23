class A
{
    int i = 1212;
}
 
class B extends A
{
    A a;
 
    public B(A a)
    {
        this.a = a;
    }
}
public class inheritance
{
    public static void main(String[] args)
    {
        A a = new A();
 
        B b = new B(a);
 
     System.out.println(a.i);
 
     System.out.println(b.i);
 
   System.out.println(b.a.i);
 
   b.a.i = 2121;
 
   System.out.println("--------");
   
        System.out.println(a.i);
   
       System.out.println(b.i);
      }
  }
  //output
  1212
  1212
  1212
  ----------------------
  2121
  1212
