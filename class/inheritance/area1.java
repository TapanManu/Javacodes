import java.lang.Math;
class Figure{
    double dim1,dim2;
    double area(){
        return dim1*dim2;
    }
}
class Rect extends Figure{
    double l,b;
    double area(){
        return l*b;
    }
}
class Triangle extends Figure{
    double a,b,c;
    double area(){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
class Main{
    public static void main(String[] args) {
        Rect r = new Rect();
        r.l=3.0;
        r.b=4.0;
        System.out.println(r.area());
        Triangle tr = new Triangle();
        tr.a=3.0;
        tr.b=3.0;
        tr.c=4.0;
        System.out.println(tr.area());
    }
}
