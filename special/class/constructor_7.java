public class A
{
	int m;

	double n;

	public A(int i)
	{
		m = i;
	}

	public A(double d)
	{
		n = d;
	}

	{
		System.out.println(m);

		System.out.println(n);
	}

	public static void main(String[] args)
	{
		A a1 = new A(500);

		A a2 = new A(50.0);

		System.out.println(a1.m+" : "+a1.n);

		System.out.println(a2.m+" : "+a2.n);
	}
}
//
0
0.0
0
0.0
500 : 0.0
0 : 50.0
