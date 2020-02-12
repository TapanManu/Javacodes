public class A
{
	String s;

	public A()
	{
		this("It's not me");

		System.out.println('A');

		System.out.println(s);
	}

	A(String  s)
	{
		System.out.println('B');

		System.out.println(this.s);

		this.s = s;
	}

	{
		System.out.println('C');

		System.out.println(s);

		this.s = "ABCD";
	}

	public static void main(String[] args)
	{
		A a1 = new A();

		A a2 = new A("It's me");
	}
}
 
Answer :
C
null
B
ABCD
A
It’s not me
C
null
B
ABCD
