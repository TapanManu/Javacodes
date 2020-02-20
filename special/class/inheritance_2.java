class A extends B {
    public static void method2() {
        System.out.print("a 2  ");
        method1();
    }
} 
 class B extends C {
    public String toString() {
        return "b";
    }
    public static void method2() {
        System.out.print("b 2  ");
        //super.method2();
    }
}
class C {
    public String toString() {
        return "c";
    }
    public static void method1() {
        System.out.print("c 1  ");
    }
    public static void method2() {
        System.out.print("c 2  ");
    }
}
class D extends B {
    public static void method1() {
        System.out.print("d 1  ");
        method2();
    }
}
public class Inheritance
{
  public static void main(String[] args) {
        
 C[] elements = {new A(), new B(), new C(), new D()};
 for (int i = 0; i < elements.length; i++) {
    System.out.println(elements[i]);
    elements[i].method1();
    System.out.println();

        System.out.println("=========================");
    }
}
}

b
c 1  
=========================
b
c 1  
=========================
c
c 1  
=========================
b
c 1  
=========================
