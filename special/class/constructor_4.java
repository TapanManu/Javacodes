1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
class ClassOne
{
    {
        System.out.println(1);
    }
 
    static
    {
        System.out.println(2);
    }
 
    public ClassOne(int i)
    {
        System.out.println(3);
    }
 
    public ClassOne()
    {
        System.out.println(4);
    }
}
 
public class ClassTwo
{
    {
        System.out.println(5);
    }
 
    public static void main(String[] args)
    {
        System.out.println(6);
 
        ClassOne one = new ClassOne();
 
        ClassOne two = new ClassOne(10);
    }
}
//output'
6
2
1
4
1
3
