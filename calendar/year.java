mport java.util.Scanner;
public class year{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int max=20,top=-1,num,d,count=0;
		int[] stack = new int[max];
		System.out.println("enter the number");
		num=scan.nextInt();
		while(count<2){
			d=num%10;
			top++;
			push(stack,top,d);
			num/=10;
			count++;
		}
		System.out.println("last two digits of a year");
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
