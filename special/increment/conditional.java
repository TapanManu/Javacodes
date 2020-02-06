class Main{
	public static void main(String[] args){
		int a=1;
		a=++a>a++?a:a;
		//here, ++a>a++ results into false this is b'coz
		//++a becomes 2 now a is 2,a++ yields 2 itself hence 2>2 is false
		//hence 3 is returned as a++ is given
		System.out.println(a);
	}
}
