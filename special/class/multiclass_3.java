class X
{
	int i = 50;
}

class Y
{
	int i = 100;

	X x;
}

public class MainClass
{
	public static void main(String[] args)
	{
		X x = new X();

		Y y = new Y();

		y.x = x;

		System.out.println(x.i);

		System.out.println(y.i);

		System.out.println(y.x.i);
	}
}
 
Answer :
50
100
50
