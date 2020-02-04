import java.util.Scanner;
class Mersenne{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Boolean flag=false,flag1=false;
		System.out.println("enter a prime number");
		int num = s.nextInt();
		flag1=isPrime(num);
		if(flag1)
		{
			int p =(int) (Math.pow(2,num)-1);
			flag=isPrime(num);
		}
		if(flag)
			System.out.println("It is a Mersenne Number");
		else
			System.out.println("It is not a Mersenne Number");
}

public static Boolean isPrime(int p){
	for(int i=2;i<=p/2;++i){
			if(p%i==0)
				return false;			
		}
		return true;
}
}
