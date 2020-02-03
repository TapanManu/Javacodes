import java.util.Scanner;
class Alpha{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any character:");
		char c = scan.next().charAt(0);//read char input
		int ch=(int)c;//type casting
		if (ch>=65 && ch<=90){
			System.out.println("character is Caps");
		}
		else if(ch>=97 && ch<=126){
			System.out.println("character is small");
		}
		else{
			System.out.println("not an alphabet");
		}
	}
}	
