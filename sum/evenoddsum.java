import java.util.Scanner;

public class evenoddsum{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int[] a= new int[20];
		int i,sumeven=0,sumodd=0,n;
		System.out.println("number of array elements");
		n=s.nextInt();
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
		if(a[i]%2==0){
			sumeven+=a[i];
		}
		else{
			sumodd+=a[i];
		}
		}
		System.out.println("sum of even numbers:"+sumeven);
		System.out.println("sum of odd numbers:"+sumodd);
	}
}
