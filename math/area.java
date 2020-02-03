import java.util.Scanner;
import java.lang.Math;
class Area {
   public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   double area;
	   final double PI=3.14;
	   System.out.println("Enter the polygon's area to be calculated");
	   System.out.println("1.Square");
	   System.out.println("2.Rectangle");
	   System.out.println("3.Triangle");
	   System.out.println("4.Circle");
	   int ch=scanner.nextInt();
	   switch(ch){
	   	case 1:System.out.println("Enter the side of square:");
	  		   double side = scanner.nextDouble();
	  		   area = side*side;
	  		   System.out.println("Area of Square is:"+area);	
	  		   break;
	  	case 2:System.out.println("Enter the length of Rectangle:");
	   		   double length = scanner.nextDouble();
	           System.out.println("Enter the width of Rectangle:");
	           double width = scanner.nextDouble();
	           area = length*width;
	           System.out.println("Area of Rectangle is:"+area);
	           break;	   
	    case 3:System.out.println("Enter the sides of Triangle:");
	   		   double a = scanner.nextDouble();
	   		   double b = scanner.nextDouble();
	   		   double c = scanner.nextDouble();
	           double s = (a+b+c)/2;
	           area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	           System.out.println("Area of Triangle is:"+area);	 
	           break;
	    case 4:System.out.println("Enter the radius:");
	   		   double rad = scanner.nextDouble();
	           area = PI*rad*rad;
	           System.out.println("Area of Circle is:"+area);	
	           break;
	    default:
	    	   System.out.println("wrong choice");               
	   }
	   
   }
}
