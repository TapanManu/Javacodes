interface Area{
    void perimeter();
}
class Rectangle implements Area{
    double length,breadth;
    double p;
    public void perimeter(){
        p = 2*(length+breadth);
        System.out.println(p); 
    }
}
class Circle implements Area{
    final double PI = 3.14;
    double radius,p;
    public void perimeter(){
        p = 2 * PI * radius;
        System.out.println(p); 
    }
}
class Main{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 5.0;
        r.breadth = 3.0;
        r.perimeter();
        Circle c = new Circle();
        c.radius = 5.0;
        c.perimeter();
    }
}
