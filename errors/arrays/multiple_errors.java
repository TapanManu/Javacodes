import java.lang.Character;
class Main{
	public static void main(String[] args){
		int []a={1,1,1};
		for(int a=0;a<a.length;a++)
			System.out.print(a[a]);
}
}
//main.java:5: error: variable a is already defined in method main(String[])
		for(int a=0;a<a.length;a++)
		        ^
main.java:5: error: int cannot be dereferenced
		for(int a=0;a<a.length;a++)
		               ^
main.java:6: error: array required, but int found
			System.out.print(a[a]);
			                  ^
3 errors
