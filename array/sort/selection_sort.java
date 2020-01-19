import java.util.Scanner;
class selsort{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int i,small;
		System.out.println("Enter the size");
		int n=s.nextInt();
		int a[]=new int[20];
		System.out.println("Enter the array");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			small=i;
			for(int j=i+1;j<n;j++){
				if(a[j]<a[small]){
					small=j;
				}
			int temp=a[small];
			a[small]=a[i];
			a[i]=temp;	
			}
		}
		System.out.println("Display the array");
		for(i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
