import java.util.Scanner;
public class delete{
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
		System.out.println("enter the position to delete element");
		int pos=s.nextInt();
		if(pos<=n){
			a[pos-1]=0;
			int j=pos-1;
			while(j<n){
				a[j]=a[j+1];
				j++;
			}
			n=n-1;
		}
		else{
			System.out.println("position cannot be found");
		}
		System.out.println("Display the array");
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
