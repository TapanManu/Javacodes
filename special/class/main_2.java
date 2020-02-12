
class ClassOne
{
    static
    {
        System.out.println(1);
    }
 
    public static void main(String[] args)
    {
        System.out.println(2);
    }
}
 
public class ClassTwo
{
    {
        System.out.println(3);
    }
 
    public static void main(String[] args)
    {
        ClassOne.main(args);
    }
}
//output
1
2
