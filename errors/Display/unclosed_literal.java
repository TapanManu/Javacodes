import java.util.Scanner;
class Main{
	public static void main(String[] args){
		int a=5;
		Scanner sc=new Scanner(System.in);
		if(System.out.print('abc'))
		{
			System.out.prinln(++a);
		}
	}
}

//error: unclosed character literal
		if(System.out.print('abc'))
		                    ^
error: ')' expected
		if(System.out.print('abc'))
		                      ^
 error: unclosed character literal
		if(System.out.print('abc'))
		                        ^
 error: ';' expected
		if(System.out.print('abc'))
		                          ^
4 errors
