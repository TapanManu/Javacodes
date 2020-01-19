import java.util.Scanner;
class bubsort{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int i,j;
		System.out.println("Enter the size");
		int n=s.nextInt();
		int a[]=new int[20];
		System.out.println("Enter the array");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Display the array");
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
