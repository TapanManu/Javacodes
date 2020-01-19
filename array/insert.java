import java.util.Scanner;
public class insert{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("Enter the size");
		int n=s.nextInt();
		int a[]=new int[20];
		System.out.println("Enter the array");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("enter the position to insert element");
		int pos=s.nextInt();
		System.out.println("enter the element to be inserted");
		int ele=s.nextInt();
		if(pos<n){
			int j=n-1;
			while(j>=(pos-1)){
				a[j+1]=a[j];
				j--;
			}
			a[pos-1]=ele;
			n=n+1;
		}
		else{
			System.out.println("item cannot be inserted");
		}
		System.out.println("Display the array");
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
