import java.util.Scanner;
class Exp{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		double sum=0;
		System.out.println("enter value of x");
		int x = s.nextInt();
		if(x>=0)
			for(int i=0;i<=x;i++)
				sum+=Math.pow(x,i)/(fact(i));
		System.out.println(sum);	
}

public static int fact(int p){
	if(p<=1)
		return 1;
	else
		return p*fact(p-1);
}
}
