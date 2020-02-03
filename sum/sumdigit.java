import java.util.Scanner;
public class sumdigit{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int num,sum=0,d;
		System.out.println("enter the number ");
		num=s.nextInt();
		while(num!=0){
			d=num%10;
			sum+=d;
			num/=10;
		}
		System.out.println("the sum is "+ sum);
	}
}
