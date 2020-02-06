
class Main{
	public static void main(String[] args){
		int a=1,b=2,c=3;
		int counter=0;
    //here loop is executed only once as update statement provides conditional
		for(System.out.println("abc");c==3;c=a<b?a++:b++){
			System.out.println(a);
			counter+=1;
		}
		System.out.println(counter);
	}
}
//output
//abc
//1
//1
