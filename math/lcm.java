import java.util.Scanner;
class LCM{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int lcm=1,small;
		System.out.println("enter two numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		lcm=(num1>num2)?num1:num2;
		while(true)
		{
			if((lcm%num1==0)&&(lcm%num2==0)){
				System.out.println("Least Common Multiple of "+ num1 + " and "  + num2 + " is " + lcm);
				break;
			}
			else
				lcm++;
		}				
}
}
