import java.util.Scanner;
class CoinNotAcceptException extends Exception{
    public CoinNotAcceptException(String s){
        super(s);
    }
}
class Vm{
    static double[] coins={0.5,1,2,5,10}; //accepted coins in vending machine
    int choice;
    double price;
    static int errorcount=0;
    void getChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Black Coffee = 6 Rs");
        System.out.println("2.Bru = 8 Rs");
        System.out.println("3.Nescafe = 10 Rs");
        choice = sc.nextInt();
        switch(choice){
            case 1:price=6;
                    break;
            case 2:price=8;
                    break;
            case 3:price=10;
                    break;
            default:
                    System.out.println("wrong choice");
        }
        try{
        getCoins(price);
        }
        catch(CoinNotAcceptException c){
            System.out.println(c.getMessage());
        }
    }
    void getCoins(double p) throws CoinNotAcceptException{
        Scanner sc = new Scanner(System.in);
        double c,sumcoins=0;
        int d;
        if(p>0){
            System.out.println("enter the coin and denomination");
            c=sc.nextDouble();
            d=sc.nextInt();
            if(check(c)){  
                sumcoins+=c*d;
                System.out.println("coin:"+c+"x"+d);  
            }
            else{
                ++errorcount;
                System.out.println("you have"+(3-errorcount)+" chances left,"+
                "try with valid coins");
                if(errorcount==3){
                    throw new CoinNotAcceptException("balance:"+(price - p));
                    //return valid coins' amount back as balance
                }
            }
            p=p-sumcoins;
            System.out.println("balance:"+Math.abs(p));
            getCoins(p);
        }
        else if(p==0){
            System.out.println("allowed");
            return;
        }
        else{
            System.out.println("balance amount returned:"+(-p));
        }
    }
    static boolean check(double coin){
        for(double c:coins)
            if(coin == c)
                return true;
        return false;
    }
    public static void main(String[] args) {
        Vm ob = new Vm();
        ob.getChoice();
    }
}
