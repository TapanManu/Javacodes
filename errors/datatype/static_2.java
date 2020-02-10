class Main{
	int i;
	char c;
	boolean b;
	double d;
	static int count;	
	public  void main(String[] args){
		Main ob1=new Main();
		Main ob2=new Main();
		int count=1;
		ob2.b=true;
		System.out.println(ob1.count);
}
}

//java Main
Error: Main method is not static in class Main, please define the main method as:
   public static void main(String[] args)
