import java.util.Scanner;
public class smalllarge{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int large=0,small=9999999,i;
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			if(a[i]<small){
				small=a[i];
			}
			if(a[i]>large){
				large=a[i];
			}
		}
		System.out.println("small:"+small);
		System.out.println("large:"+large);
	}
}
