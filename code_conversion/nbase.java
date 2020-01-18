import java.util.Scanner;
public class nbase{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int max=20,top=-1,num,d,n;
		int[] stack = new int[max];
		System.out.println("enter the number");
		num=scan.nextInt();
		System.out.println("enter the base");
		n=scan.nextInt();
		while(num!=0){
			d=num%n;
			top++;
			push(stack,top,d);
			num/=n;
		}
		while(top!=-1){
			pop(stack,top);
			top--;
		}
	}
	public static void push(int[] stack,int top,int ele){
		if(top==20){
			System.out.println("maximum reached");
		}
		else{
			stack[top]=ele;
		}
	}
	public static void pop(int[] stack,int top){
		int x;
		if(top==-1){
			System.out.println("underflow");
		}
		else{
			x=stack[top];
			System.out.print(x);
		}
	}
}
