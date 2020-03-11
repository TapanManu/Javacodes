import java.util.EventListener;

class Str{
    public static void main(String[] args) {
        String name1 = "Tapan";
        String name2 = "Tapan";
        if(name1 == name2){
            System.out.println("equal");
            //hard coding produces equals to case-same memory address here!
            //but input from the user results in not equal!as memory address are different here
        }
        else
        {
            System.out.println("not equal");
        }
        if (name1.equals(name2)){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
