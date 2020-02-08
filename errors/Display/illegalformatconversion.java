import java.lang.Character;
class Main{
	public static void main(String[] args){
		int [] arr={3,2,1,29,5,3};
		int i=0,j=0,first=0,second=0;
		int num=7;
		Boolean flag=false;
		for(i=0;i<arr.length;i++){
			first=arr[i];
			for(j=i+1;j<arr.length;j++){
				second=arr[j];
				if(first+second==num){
					flag=true;
					System.out.printf("(%f,%f)",first,second);
				}
			}
		}
		if(flag==false){
			System.out.print("no such pair whose sum is equal to given Number");
		}
}
}

//output
//(Exception in thread "main" java.util.IllegalFormatConversionException: f != java.lang.Integer
	at java.util.Formatter$FormatSpecifier.failConversion(Formatter.java:4302)
	at java.util.Formatter$FormatSpecifier.printFloat(Formatter.java:2806)
	at java.util.Formatter$FormatSpecifier.print(Formatter.java:2753)
	at java.util.Formatter.format(Formatter.java:2520)
	at java.io.PrintStream.format(PrintStream.java:970)
	at java.io.PrintStream.printf(PrintStream.java:871)
	at Main.main(main.java:14)
