import java.util.Scanner;
public class nperfect{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int n,num=10,i=0;
		System.out.println("how manieth perfect number do you want?");
		n=s.nextInt();
		while(i<n){
			num+=9;
			i++;
			if(num%10==0){
				i--;
			}
		}
		System.out.println("number is:"+num);
	}
}
