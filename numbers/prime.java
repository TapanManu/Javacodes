import java.util.Scanner;
public class prime{
	public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	int num,flag=0;
	System.out.println("enter the number");
	num=scan.nextInt();
	int sum=0;
	if(num==1){
		System.out.println("the number is neither prime nor composite");
	}
	else{
	for(int i=2;i<num;i++){
		if(num%i==0){
			flag=1;
		}
	}
	if(flag==0){
		System.out.println("the number is prime");
	}
	else{
		System.out.println("the number is not prime");
	}
}
}
}
