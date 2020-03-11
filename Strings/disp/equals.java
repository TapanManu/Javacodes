import java.util.EventListener;

class Str{
    public static void main(String[] args) {
        String name1 = "Tapan";
        String name2 = "Tapan";
        if(name1 == name2){
            System.out.println("equal");
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
