class X
{
	Z z = new Z();
}

class Y
{
	X x = new X();
}

class Z
{
	Y y = new Y();
}

public class MainClass
{
	public static void main(String[] args)
	{
		Z z = new Z();
	}
}
//Exception in thread “main” java.lang.StackOverflowError. 
Constructors of all three classes are recursively called while you try to create an object to any class.
