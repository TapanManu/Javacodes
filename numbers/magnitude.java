import java.util.Scanner;
class Mag{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		double n;
		System.out.println("Enter the number");
		n=s.nextDouble();
		if(n!=0){
			if(n>0)System.out.println("number is positive");
			else
				System.out.println("number is negative");
		}
		else
			System.out.println("number is zero");
	}
}
