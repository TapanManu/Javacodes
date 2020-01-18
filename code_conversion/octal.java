import java.util.Scanner;
public class octal{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int max=20,top=-1,num,d;
		int[] stack = new int[max];
		System.out.println("enter the number");
		num=scan.nextInt();
		while(num!=0){
			d=num%8;
			top++;
			push(stack,top,d);
			num/=8;
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
