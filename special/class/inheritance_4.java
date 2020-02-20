class Brienne extends Oberyn {
    public static void a() {
        System.out.print("Brienne-a   ");
    }
}
class Arya {
    public static  void a() {
        System.out.print("Arya-a   ");
    }
public static  void b() {
        a();
        System.out.print("Arya-b   ");
    }
    public String toString() {
        return "Arya";
    }
}
  class Tyrion extends Arya {
    public static  void a() {
     //   super.a();
        System.out.print("Tyrion-a   ");
    }
}
  class Oberyn extends Arya {
    public static void b() {
        System.out.print("Oberyn-b   ");
      //  super.b();
    }
    public String toString() {
        return "Oberyn";
    }
}
public class Inheritance

{
  public static void main(String[] args) {

Arya[] thrones = { new Oberyn(), new Arya(), new Brienne(), new Tyrion() };
for (int i = 0; i < thrones.length; i++) {
    thrones[i].a();
    System.out.println();
    System.out.println(thrones[i]);
    thrones[i].b();
    System.out.println();
    System.out.println();
System.out.println("=========================");
}
}
}
Arya-a   
Oberyn
Arya-a   Arya-b   

=========================
Arya-a   
Arya
Arya-a   Arya-b   

=========================
Arya-a   
Oberyn
Arya-a   Arya-b   

=========================
Arya-a   
Arya
Arya-a   Arya-b   

=========================
