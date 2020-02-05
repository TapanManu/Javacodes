import java.util.Scanner;
class Main{
	 public static void main(String[] args) {
	 	int a=1,b;
	 	b=a++ + ++a;
	 	//here left to right associativity of + is used above
	 	//here, first a++ is done it is post-increment operator, ie 1
	 	//then a becomes 2 and then ++a becomes 3
	 	//b=1+3=4
	 	System.out.println(b);
	 	System.out.println(a++);
	 	System.out.println(a);
	 	System.out.println(++a);
	}	
}
