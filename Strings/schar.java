import java.util.Scanner;
import java.lang.Character;
class Char{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any character:");
		char c = scan.next().charAt(0);//read char input
		if (Character.isLetter(c))
			System.out.println("character is alphabet");
		else if(Character.isDigit(c))
			System.out.println("character is digit");
		else
			System.out.println("character is special");
	}
}	
