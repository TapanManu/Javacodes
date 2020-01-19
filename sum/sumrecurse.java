import java.util.Scanner;
public class sumrecurse{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the element");
		int num=s.nextInt();
		int total=sum(num);
		System.out.println("The sum of elements are "+ total);
	}
	public static int sum(int n){
		if(n==1){
			return 1;
		}
		return n+sum(n-1); 
	}
}
