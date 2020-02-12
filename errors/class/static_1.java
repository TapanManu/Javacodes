class A
{
    int i;
 
    static
    {
        System.out.println(i);
    }
}
//It gives compile time error (Line 7). Because, you can’t refer a non static field inside a static initialization block.
