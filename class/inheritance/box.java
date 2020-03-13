class Box{
    private double length,breadth,height;
    Box(double l,double b,double h){
        length=l;
        breadth=b;
        height=h;
    }
    double area(){
        return 2*(length*breadth+breadth*height+height*length);
    }
    double vol(){
        return length*breadth*height;
    }
}
class BoxDemo extends Box{
    BoxDemo(double l,double b,double h){
        super(l,b,h);
    }
    public static void main(String[] args) {
        BoxDemo b = new BoxDemo(5.0,3.0,4.0);
        System.out.println(b.area());
        System.out.println(b.vol());
    }
}
