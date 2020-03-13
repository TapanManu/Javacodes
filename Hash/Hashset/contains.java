import java.util.HashSet;
class Char{
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<String>();
        str.add("Hello Hash");
        str.add("a");
        if(str.contains("a")){
            System.out.println("yes");
        }
    }
}
