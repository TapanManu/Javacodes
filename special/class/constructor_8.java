public class A
{
	String s;

	A a;

	public A(String s)
	{
		this.s = s;
	}

	public static void main(String[] args)
	{
		A a1 = new A("first");

		A a2 = new A("second");

		a1.a = a2;

		a2.a = a1;

		System.out.println(a1.a.s);

		System.out.println(a2.a.s);
	}
}
 
Answer :
second
first
