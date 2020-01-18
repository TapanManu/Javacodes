import java.util.Scanner;

public class math{
	public static void main(String[] args){
		int m,n,res,opt;
		double div;
		Scanner s= new Scanner(System.in);
        while(true)
        {
        	System.out.println("Choose your option:");
        	System.out.println("Press 1 for addition");
        	System.out.println("Press 2 for subtraction");
        	System.out.println("Press 3 for multiplication");
        	System.out.println("Press 4 for division");
        	System.out.println("Press 5 for exit");
        	opt=s.nextInt();
        	System.out.println("Enter first number:");
        	m=s.nextInt();
			System.out.println("Enter second number:");
       		n=s.nextInt();
        	switch(opt)
        	{
        		case 1:
        		res=m+n;
        		System.out.println("the sum is:"+res);
        		break;
        		case 2:
        		res=m-n;
        		System.out.println("the result is:"+res);
        		break;
        		case 3:
        		res=m*n;
        		System.out.println("the product is:"+res);
        		break;
        		case 4:
        		div=(double)m/n;
        		System.out.println("the quotient is:"+div);
        		break;
        		case 5:
        		System.exit(0);
        		break;
    		}
    	}
	}
}	
