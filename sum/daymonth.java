import java.util.Scanner;
public class daymonth{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day");
		int year,m,d,week;
		int day=s.nextInt();
		year=day/365;
		System.out.println("number of years:"+ year);
		m=day%365;
		week=m/7;
		m=m%7;
		System.out.println("number of weeks :"+ week);
		d=m;
		System.out.println("number of days :"+ d);
	}
}
