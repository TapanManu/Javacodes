import java.util.Scanner;

class ElectricityUnit
{
 public static void main(String args[]) 
 {
  int units;
  double amount=0;
  Scanner scan=new Scanner(System.in);

  System.out.println("Enter Units :");
  units=scan.nextInt();
  if(units<=50){
  	amount=0.5*units;
  }
  else if(units<=150){
  	amount=0.75*units;
  }
  else if(units<=250){
  	amount=1.20*units;
  }
  else if(units>250){
  	amount=1.50*units;
  }
  amount=amount+0.2*amount;
  
  System.out.println("Bill: "+ amount);
  }
}
