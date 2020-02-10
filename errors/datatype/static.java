class Main{
	protected int i;
	protected char c;
	protected boolean b;
	protected double d;
	static int count;	
	public static void main(String[] args){
		Main ob1=new Main();
		Main ob2=new Main();
		int count=1;
		ob2.b=true;
		System.out.println(i);

}
}
//javac main.java
main.java:13: error: non-static variable i cannot be referenced from a static context
		System.out.println(i);
		                   ^
1 error
