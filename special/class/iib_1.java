//
public class A
{
    char c = 'A';
 
    {
        c = 'B';
    }
 
    {
        c = 'C';
    }
}
//output
public class A
{
    char c = 'A';     // (1)
 
    {
        c = 'B';      // (2)
    }
 
    {
        c = 'C';      // (3)
    }
}
