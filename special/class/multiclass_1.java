
class ClassOne
{
    static
    {
        System.out.println('A');
    }
 
    static char c = 'Z';
 
    static char getC()
    {
        return c;
    }
}
 
public class ClassTwo
{
    {
        System.out.println('B');
    }
 
    public static void main(String[] args)
    {
        char c;
 
        c = ClassOne.getC();
 
        System.out.println(c);
    }
}
//output
A
Z
