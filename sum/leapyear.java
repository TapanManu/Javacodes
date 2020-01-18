import java.util.Scanner;
public class year{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		long year;
		System.out.println("Enter any year:");
		year=scan.nextInt();
		boolean flag=false;
		if(year%4==0){
			flag=true;
			if(year%100==0){
				flag=false;
				if(year%400==0){
					flag=true;
				}
			}
		}
		if(flag){
		System.out.println(" year "+ year +" is leap year");
		}
		else{
			System.out.println("year"+ year +"is not leap year");
		}
	}
}	
