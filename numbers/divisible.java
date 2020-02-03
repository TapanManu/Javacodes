import java.util.Scanner;
class Div{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n=s.nextInt();
		if(n%55==0)
			System.out.println("the number is div by 5 and 11");
		else
			System.out.println("the number is not div by 5 and 11");
	}
}
