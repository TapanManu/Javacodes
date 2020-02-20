class George extends Elaine {
    public static void method1() {
        System.out.print("George 1 ");
    }
}
 class Jerry {
    public static void method1() {
        System.out.print("Jerry 1 ");
    }
     public static  void method2() {
        System.out.print("Jerry 2 ");
    }
      public String toString() {
        return "Jerry";
    }
}
class Elaine extends Kramer {
    public String toString() {
        return "Elaine " + super.toString();
   }
}
class Kramer extends Jerry {
    public static void method1() {
      //  super.method1();
        System.out.print("Kramer 1 ");
    }
     public static void method2() {
        System.out.print("Kramer 2 ");
        method1();
     }
    public String toString() {
        return "Kramer";
    }
}
 
public class Inheritance
{
  public static void main(String[] args) {

 
 
Jerry[] seinfeld = { new George(), new Kramer(), new Jerry(), new Elaine() };
for (int i = 0; i < seinfeld.length; i++) {
    seinfeld[i].method1();
    System.out.println();
    seinfeld[i].method2();
    System.out.println();
    System.out.println(seinfeld[i]);
    System.out.println();
System.out.println("=========================");
}
}
}
Jerry 1 
Jerry 2 
Elaine Kramer

=========================
Jerry 1 
Jerry 2 
Kramer

=========================
Jerry 1 
Jerry 2 
Jerry

=========================
Jerry 1 
Jerry 2 
Elaine Kramer

=========================
