import java.util.Scanner;
class Main{
	 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 char ch=sc.next().charAt(1); 
		 //error if only one char input given
	//same effect if charAt(-1);	 
	 System.out.println(ch);
	}
}

//~$ java Main
w
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 1
	at java.lang.String.charAt(String.java:658)
	at Main.main(Main.java:5)
