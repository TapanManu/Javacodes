import java.util.Scanner;
class HCF{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int hcf=1,small;
		System.out.println("enter two numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		small=(num1<num2)?num1:num2;
		for(int i=1;i<=small;i++){
			if((num1%i==0)&&(num2%i==0))
				hcf=i;
		}		
		System.out.println("Highest Common Factor of "+ num1 + " and "  + num2 + " is " + hcf);
}
}
