import java.util.Scanner;
class Main{
	public static void main(String[] args){
		int a=5;
		Scanner sc=new Scanner(System.in);
		System.out.print();
	}
}

//javac main.java
main.java:6: error: no suitable method found for print(no arguments)
		System.out.print();
		          ^
    method PrintStream.print(boolean) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(char) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(int) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(long) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(float) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(double) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(char[]) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(String) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(Object) is not applicable
      (actual and formal argument lists differ in length)
1 error
