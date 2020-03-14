import java.util.ArrayList;
//import java.util.HashSet;
class Str{
    public static void main(String[] args) {
        String str="Tapan Manu";
        str=str.toLowerCase();
        ArrayList<Character> first = new ArrayList<Character>(str.length());
        ArrayList<Character> repeat = new ArrayList<Character>(str.length());
        for(int i=0;i<str.length();i++){
            if(repeat.contains(str.charAt(i))){
               if(!first.isEmpty() && 
               first.contains(str.charAt(i)))
                    first.remove((Character)str.charAt(i));
               repeat.add(str.charAt(i));
            }
            else{
                first.add(str.charAt(i));
                repeat.add(str.charAt(i));
            }
        }
        if(first.isEmpty())
            System.out.println("no unique character");
        else
            System.out.println(first.get(0));
    }
}
