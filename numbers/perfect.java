import java.util.Scanner;
public class perfect{
	public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	int a,b,d;
	System.out.println("enter the number");
	a=scan.nextInt();
	int sum=0;
	for(int i=1;i<a;i++){
		if(a%i==0){
			sum+=i;
		}
	}
	if(sum==a){
		System.out.println("the number is perfect");
	}
	else{
		System.out.println("the number is not perfect");
	}
}
}
