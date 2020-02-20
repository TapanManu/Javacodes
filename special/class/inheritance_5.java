class George extends Elaine {
    public void method1() {
        System.out.print("George 1 ");
    }
}
 class Jerry {
    public void method1() {
        System.out.print("Jerry 1 ");
    }
     public void method2() {
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
    public void method1() {
        super.method1();
        System.out.print("Kramer 1 ");
    }
     public void method2() {
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
George 1 
Kramer 2 George 1 
Elaine Kramer

=========================
Jerry 1 Kramer 1 
Kramer 2 Jerry 1 Kramer 1 
Kramer

=========================
Jerry 1 
Jerry 2 
Jerry

=========================
Jerry 1 Kramer 1 
Kramer 2 Jerry 1 Kramer 1 
Elaine Kramer

=========================
