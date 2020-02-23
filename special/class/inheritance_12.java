class X {
    int i = 101010;
     public X()
    {
        i = i++ + i-- - i;
    }
     static int staticMethod(int i)     {
        return --i;
    }
}
 
class Y extends X
{
    public Y()
    {
        System.out.println(staticMethod(i));
    }
}
public class inheritance {
    public static void main(String[] args)     {
        Y y = new Y();
    }
}
//output
101010
