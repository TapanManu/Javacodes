import java.util.Scanner;
public class reverse{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int num,rev=0,d;
		System.out.println("enter the number to be reversed");
		num=s.nextInt();
		while(num!=0){
			d=num%10;
			rev=(rev*10)+d;
			num/=10;
		}
		System.out.println("the reversed number is "+ rev);
	}
}
