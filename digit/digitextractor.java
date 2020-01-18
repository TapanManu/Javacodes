import java.util.Scanner;
public class digitextractor{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int num,n,count=0,d=0;
		System.out.println("enter the number ");
		num=s.nextInt();
		System.out.println("enter the position of digit to be extracted(from right)");
		n=s.nextInt();
		while(count<n){
			d=num%10;
			count++;
			num/=10;
		}
		if(d==0){
			System.out.println("could not found digit");
		}
		else{
		System.out.println("the digit is "+ d);
	}
	}
}