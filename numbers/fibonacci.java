import java.util.Scanner;
public class fibonacci{
	public static void main(String[] args){
	Scanner scan= new Scanner(System.in);
	int num,flag=0;
	System.out.println("enter the number of elemets in fibonaci series");
	num=scan.nextInt();
	int sum=0;
	for(int i=0;i<num;i++){
		System.out.print(fib(i)+" ");
	}
}
public static int fib(int n){
	if(n<=1){
		return n;
	}
	else{
		return fib(n-1)+fib(n-2);
	}
}
}

