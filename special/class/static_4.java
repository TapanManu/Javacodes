
public class A
{
    static int staticField = 10;     //Static Field
 
    //Instance Initialization Block - IIB
 
    {
        //using static field inside IIB
 
        System.out.println(staticField);
    }
}
//output
//10
