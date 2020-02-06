import java.util.Scanner;
class Main{
	public static void main(String[] args){
		int a=5;
		Scanner sc=new Scanner(System.in);
		System.out.print(null);
	}
}
// error: reference to print is ambiguous
		System.out.print(null);
		          ^
  both method print(char[]) in PrintStream and method print(String) in PrintStream match
1 error
