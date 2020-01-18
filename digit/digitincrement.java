import java.util.Scanner;
public class digitincrement{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int num,n,temp=0,d=0;
		System.out.println("enter the number ");
		num=s.nextInt();
		while(num!=0){
			d=num%10;
			if(d==9){
				d=0;
			}
			else{
			d++;
			}
			temp=temp*10+d;
			num/=10;
		}
		num=temp;
		temp=0;
		while(num!=0){
			d=num%10;
			temp=temp*10+d;
			num/=10;
		}
		System.out.println("number is:" + temp);
	}
}