public class A
{
    {
        System.out.println(1);
 
        id = 1001;
    }
 
    static
    {
        System.out.println(2);
 
        name = "NAME";
    }
 
    static String name;
 
    public A(String name, int id)
    {
        System.out.println(3);
 
        this.name = name;
 
        this.id = id;
    }
 
    int id;
 
    {
        System.out.println(4);
 
        System.out.println(id);
    }
 
    static
    {
        System.out.println(5);
 
        System.out.println(name);
    }
 
    public static void main(String[] args)
    {
        System.out.println(6);
 
        A a = new A("MyName", 1111);
    }
}
//output
2
5
NAME
6
1
4
1001
3
