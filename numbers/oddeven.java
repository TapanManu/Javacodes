import java.util.Scanner;
class OddEven{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter the natural number");
		n=s.nextInt();
		//using bitwise and 
		if((n&1)==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}
	//modulus operator is slow in execution compared to bitwise operator
}
