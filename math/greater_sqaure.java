class Main{
	public static void main(String[] args){
		int i=1,j=250,sum=0;
		for(;sum<j;i+=2)
		{
			sum+=i;
			System.out.println(sum);
		}
			System.out.println("nearest greater number which is square:"+sum+",square root:"+(int)Math.sqrt(sum));

	}
}
//output
//nearest greater number which is square:256,square root:16
