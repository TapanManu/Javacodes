import java.util.Scanner;
public class armstrong{
	public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	int a,b,d;
	System.out.println("enter the number");
	a=scan.nextInt();
	int sum=0;
	b=a;
	while(b!=0){
		d=b%10;
		sum=sum+(d*d*d);
		b/=10;
	}
	if(sum==a){
		System.out.println("the number is armstrong");
	}
	else{
		System.out.println("the number is not armstrong");
	}
}
}
