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
class ClassOne
{
    {
        s = "second";
    }
 
    String s = "first";
 
    {
        System.out.println(s);
 
        s = "third";
    }
 
    public ClassOne()
    {
        System.out.println(s);
    }
 
    public ClassOne(String s)
    {
        System.out.println(s);
 
        this.s = s;
    }
}
 
public class ClassTwo
{
    public static void main(String[] args)
    {
        ClassOne one = new ClassOne("last");
 
        ClassOne two = new ClassOne();
    }
}
//output
first
last
first
third
