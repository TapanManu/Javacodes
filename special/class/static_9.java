public class A
{
	static void test()
	{
		System.out.println("Tested....");
	}

	static
	{
		test();
	}

	public static void main(String[] args)
	{
		test();
	}
}
 
Answer :
Tested….
Tested….
