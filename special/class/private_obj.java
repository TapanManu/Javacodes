 class Main{
	private int i;
	private char c;
	private boolean b;
	private double d;
	static int count;	
	public static void main(String[] args){
		Main ob1=new Main();
		Main ob2=new Main();
		int count=1;
		ob2.b=true;
		System.out.println(ob1.i);
		System.out.println(ob2.i);
		System.out.println(ob1.b);
		System.out.println(ob2.b);

}
}
//0 
0
false
true
