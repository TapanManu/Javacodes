public class A
{
	char c = 'A';

	A a;

	{
		System.out.println(c);

		c = 'B';
	}

	public A(A a)
	{
		this.a = a;
	}

	public static void main(String[] args)
	{
		A a = null;

		a = new A(a);

		System.out.println(a.c);

		System.out.println(a.a.c);

		System.out.println(a.a.a.c);

		System.out.println(a.a.a.a.c);

		a.a.a.a.a.c = 'Z';

		System.out.println(a.c);
	}
}
 //output
 You will get NullPointerException at run time. Because, a.a has not been initialized. It is pointing to null.
