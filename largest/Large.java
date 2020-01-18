import java.util.Scanner;

public class Large{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a,b,c,large=0;

        System.out.println("Enter the first number:");
        a=s.nextInt();
        System.out.println("Enter the second number:");
        b=s.nextInt();
        System.out.println("Enter the third number:");
        c=s.nextInt();

        if(a<b){
            large=b;
        }
        else {
            large=a;
        }
        if(large<c){
            large=c;
        }
        System.out.println("Largest is:"+large);

    }
   }
