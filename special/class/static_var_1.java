class Main{
	int i;char c;boolean b;double d;
	static int count;	
	public static void main(String[] args){
		Main ob1=new Main();
		Main ob2=new Main();
		System.out.print(count);
		System.out.print(Main.count);
		System.out.print(ob1.count++);
		System.out.print(ob2.count);

}
}
//output
//0001
