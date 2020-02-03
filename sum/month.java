import java.util.Scanner;

class Month{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the month:");
		int m = scan.nextInt();
		switch(m){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:System.out.println("31 days");
					break;
			case 2:System.out.println("28 or 29 days");
					break;
			case 4:
			case 6:
			case 9:
			case 11:System.out.println("30 days");
					break;
			default:System.out.println("wrong input");				
		}
	}
}	
