class Main{
	int i;char c;boolean b;double d;
	static int count;	
	 static void main(String[] args){
		Main ob1=new Main();
		Main ob2=new Main();
		int count=1;
		System.out.print(count);
		System.out.print(Main.count);
		System.out.print(ob1.count);
		System.out.print(ob2.count);

}
}

//java Main
Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
