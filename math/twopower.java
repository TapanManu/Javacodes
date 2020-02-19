import java.util.Scanner;
class Power{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer=sc.nextInt();
        int i;
        boolean flag=false;
        if(integer==1)
            flag=true;
        for(i=integer;i>=4;i>>>=1){
            if(i/2==2 && i%2==0){
                flag=true;
                break;
            }  
        }    
        if(flag){
            System.out.println("power of two");
        }
        else{
            System.out.println("not a power of two");
        }
    }
}