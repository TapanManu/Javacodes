import java.util.Scanner;
class ElectBill{
    private long cno;
    String cname;
    String cadd;
    long nou;
    ElectBill(long no,String name,String add){
        cno=no;
        cname=name;
        cadd=add;
    }
    void display(){
        System.out.println("consumer number:"+cno);
        System.out.println("consumer name:"+cname);
        System.out.println("consumer address:"+cadd);
    }
    void calculate(long unit){
        nou=unit;
        double charges=500;
        double addition;
        if(nou>300)
            addition=1.50*(nou-300);
        else if(nou>200)
            addition=1.20*(nou-200);
        else if(nou>100)
            addition=1.0*(nou-100);
        else
            addition=0;
        charges=charges+addition;
        System.out.println("total amount:"+charges);      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectBill c[]= new ElectBill[3];
        System.out.println("consumer_number,name and address and amount");
        for(int i=0;i<3;i++){
        c[i] = new ElectBill(sc.nextLong(),sc.nextLine(),sc.nextLine());
        c[i].display();
        c[i].calculate(sc.nextLong());
        }
    }

}
