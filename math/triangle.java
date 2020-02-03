import java.util.Scanner;

class Triangle{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Angles:");
		short a = scan.nextShort();
		short b = scan.nextShort();
		short c = scan.nextShort();
		if((a+b+c)==180){
			if((a==b)&&(b==c)){
				System.out.println("equilateral Triangle");
			}
			else if((a==0)||(b==0)||(c==0)){
				System.out.println("not a Triangle");
			}
			else if((a==b)||(b==c)||(c==a)){
				System.out.println("Isoceles Triangle");
			}
			else if((a==90)||(b==90)||(c==90)){
				System.out.println("Right Triangle");
			}
			else{
				System.out.println("Scalene Triangle");
			}
		}
		else{
			System.out.println("not a Triangle");
		}
		
	}
}	
