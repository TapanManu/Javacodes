public class A
{
	int i;

	A a;

	{
		i = 10;

		a = new A();
	}

	public static void main(String[] args)
	{
		A a = new A();

		System.out.println(a.a.a.a.a.a.i);
	}
}
//You will get StackOverflowError at run time. Because, constructor of class A will be kept on calling.
