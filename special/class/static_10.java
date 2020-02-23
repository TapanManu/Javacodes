class ClassOne
{
     static int i, j = 191919;
 
     {
         --i;
         System.out.println(i);
         System.out.println(j);
 
     }
 
     {
         j++;
         System.out.println(i);
         System.out.println(j);
 
     }
}
public class inheritance extends ClassOne
{
    static
    {
        i++;
         System.out.println(i);
         System.out.println(j);
    }
     static
    {
        --j;
         System.out.println(i);
         System.out.println(j);
     }
     public static void main(String[] args)
    {
        System.out.println(i);
         System.out.println(j);
    }
}

//
1
191919
1
191918
1
191918
