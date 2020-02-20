 class Eve {
    public void a() {
        System.out.print("Eve a   ");
    }

    public void b() {
        System.out.print("Eve b   ");
    }
     public String toString() {
        return "Eve ts";
    }
}
class Sam extends Eve {
    public void b() {
        a();
        System.out.print("Sam b   ");
    }

    public String toString() {
        return "Sam ts";
    }
}

 class Lucas extends Sam {
    public void a() {
        System.out.print("Lucas a   ");
        System.out.print(toString() + "   ");
    }
     public String toString() {
        String sup = super.toString();
        return sup + " " + sup;
    }
}

 class Josh extends Lucas {
    public void b() {
        System.out.print("Josh b   ");
        super.b();
    }

    public String toString() {
        return "Josh ts";
    }
}
public class Inheritance
{
  public static void main(String[] args) {
 
Eve[] elements = { new Eve(), new Sam(), new Lucas(), new Josh() };
for (int i = 0; i < elements.length; i++) {
    System.out.println(elements[i]);
    elements[i].a();
    System.out.println();
    elements[i].b();
    System.out.println();
    System.out.println();
} 
}
}
