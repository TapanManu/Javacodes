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
        inheritance ob = new inheritance();
        System.out.println(i);
         System.out.println(j);
    }
}

//output
1
191919
1
191918
0
191918
0
191919
0
191919
