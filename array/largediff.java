import java.util.Scanner;
import java.lang.Math;
class LargeDiff{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n,i,j,large;
		System.out.println("enter the array size");
		n=s.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		//display the array
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		large=-1;
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(Math.abs(arr[i]-arr[j])>large){
					large=Math.abs(arr[i]-arr[j]);
				}
			}
		}
		System.out.println("largest difference:"+large);
	}
}
