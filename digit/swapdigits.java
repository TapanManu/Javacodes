import java.util.Scanner;
class SwapDigit{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		int lsb = num%10;
		int msb = num/(int)(Math.pow(10,(int)Math.log10(num)));
		System.out.println(lsb+" "+msb);
		int newnumber = lsb* (int)(Math.pow(10,(int)Math.log10(num)));
		System.out.println(newnumber);
		newnumber+=num%((int)(Math.pow(10,(int)Math.log10(num))))-lsb+msb;
		System.out.println(newnumber);
	}
}
