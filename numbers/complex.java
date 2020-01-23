import java.util.Scanner;
public class complex{
	public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	int real1,img1,real2,img2;
	System.out.println("enter the real part of first number");
	real1=scan.nextInt();
	System.out.println("enter the imaginary part of first number");
	img1=scan.nextInt();
	System.out.println("complex number 1:"+ real1+"+"+img1+"i");
	System.out.println("enter the real part of second number");
	real2=scan.nextInt();
	System.out.println("enter the imaginary part of second number");
	img2=scan.nextInt();
	System.out.println("complex number 2:"+ real2+"+"+img2+"i");
	System.out.println("complex number sum:"+(real1+real2)+"+"+(img1+img2)+"i");

}
}
