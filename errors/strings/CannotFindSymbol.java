import java.util.Scanner;
class Main{
	 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 char ch=sc.next().CharAt(0);       //error     
   
   //next().charAt(0) is the correct one
   
	 System.out.println(ch);
	}
}



//Main.java:5: error: cannot find symbol
	 char ch=sc.next().CharAt(0);
	                  ^
  symbol:   method CharAt(int)
  location: class String
1 error
