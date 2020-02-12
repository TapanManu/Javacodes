
class ClassOne
{
    char c = 'A';
 
    {
        c = 'B';
    }
 
    public ClassOne(char c)
    {
        this.c = c;
    }
}
 
public class ClassTwo
{
    public static void main(String[] args)
    {
        ClassOne one = new ClassOne('Z');
 
        System.out.println(one.c);
    }
}
//output
//Z
