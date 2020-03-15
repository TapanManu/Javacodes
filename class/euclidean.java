import java.lang.Math;
class Coordinates{
    public double x,y,z;
    Coordinates(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
}
class Eucledian{
   public static void main(String[] args) {
       System.out.print(dist());
   }
   public static double dist(){
    Coordinates a,b;
    a= new Coordinates(0.0,0.0,0.0);
    b= new Coordinates(5.0,4.0,3.0);
    return Math.sqrt(Math.pow(b.x-a.x,2.0)
    +Math.pow(b.y-a.y,2.0)+Math.pow(b.z-a.z,2.0));
   }
}
