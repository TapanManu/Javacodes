class Coordinates{
    private double x,y;
    private double r,theta;
    void caretesianPolar(double x1,double x2){
        x=x1;
        y=x2;
        r=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        theta=Math.atan2(y,x);
        System.out.println("equivalent polar coordinates");
        System.out.println("r:"+r+" "+"o:"+theta);
    }
    void polarCartesian(double r1,double o1){
        r=r1;
        theta=o1;
        x=r*Math.cos(theta);
        y=r*Math.sin(theta);
        System.out.println("equivalent cartesian coordinates");
        System.out.println("x:"+x+" "+"y:"+y);
    }
    public static void main(String[] args) {
        Coordinates cartesian = new Coordinates();
        Coordinates polar = new Coordinates();
        cartesian.caretesianPolar(12, 5);
        polar.polarCartesian(13,1.57);

    }
}
