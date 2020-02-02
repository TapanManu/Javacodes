import java.util.Scanner;
class EleCount{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n;
		System.out.println("enter the max size of array");
		n=s.nextInt();
		double[] arr=new double[n];
		System.out.println("enter the array");
		for(int i=0;i<n;i++){
			arr[i]=s.nextDouble();
		}
		double ele;
		System.out.println("enter the element to search for count frequency");
		ele=s.nextDouble();
		int count=0;
		for(int i=0;i<n;i++){
			if(ele==arr[i]){
				count+=1;
				System.out.println("element present at:"+(i+1));
			}
			
		}
		System.out.println("frequency:"+count);
	}
}
