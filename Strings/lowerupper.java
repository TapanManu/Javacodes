import java.util.Scanner;
import java.lang.Character;
class Char{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any character:");
		char c = scan.next().charAt(0);//read char input
		if (Character.isLowerCase(c))
			System.out.println("Character is lowercase");
		else if(Character.isUpperCase(c))
			System.out.println("Character is uppercase");
	}
}	
