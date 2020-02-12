
public class A
{
    public A(int i)
    {
        this((float)23.5);
    }
 
    public A(float f)
    {
        this(28.56);
    }
 
    A(double d)
    {
        this(10);
    }
}
//error
constructors cannot be called recursively
