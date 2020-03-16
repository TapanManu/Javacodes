import java.util.Scanner;
public class Numbers{
    int a,b,c;
    Numbers(int num1,int num2){
        a=num1;
        b=num2;
        this.disp(a,b);
    }
    Numbers(int n1,int n2,int n3){
        a=n1;
        b=n2;
        c=n3;
        this.disp(a,b,c);
    }
    void disp(int a,int b){
        System.out.println("a+b is equal to "+(a+b));
        System.out.println("a-b is equal to"+(a-b));
        System.out.println("axb is equal to "+(a*b));
        System.out.println("a/b is equal to "+(a/b)); //assume zero not given
        System.out.println("a%b is equal to "+(a%b));
    }
    void disp(int a,int b,int c){
        System.out.println("(a-b)/c is equal to "+((a-b)/c));
        System.out.println("(a-c)/b is equal to "+((a-c)/b));
        System.out.println("(b-a)/c is equal to "+((b-a)/c));
        System.out.println("(b-c)/a is equal to "+((b-c)/a)); //assume zero not given
        System.out.println("(c-a)/b is equal to "+((c-a)/b));
        System.out.println("(c-b)/a is equal to "+((c-b)/a));
    }
    public static void twoNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        Numbers n = new Numbers(sc.nextInt(),sc.nextInt());
       
    }
    public static void threeNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers");
        Numbers n = new Numbers(sc.nextInt(),sc.nextInt(),sc.nextInt());
    }
    public static void main(String[] args) {
        twoNum();
        threeNum();
    }
}
