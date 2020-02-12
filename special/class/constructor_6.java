
class ClassOne
{
    String s;
 
    {
        s = "FIRST";
    }
 
    {
        s = "SECOND";
    }
 
    public ClassOne()
    {
        s = "THIRD";
    }
 
    public ClassOne(String s)
    {
        this();
 
        System.out.println(this.s);
    }
}
 
public class ClassTwo
{
    public static void main(String[] args)
    {
        ClassOne one = new ClassOne("LAST");
    }
}
///output
THIRD
