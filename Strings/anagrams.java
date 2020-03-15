import java.util.ArrayList;
class Anagram{
    public static void main(String[] args) {
        if(anagram("elbow","below"))
            System.out.println("Anagrams");
        else
            System.out.println("not anagrams");
        
    }
    public static Boolean anagram(String str,String word){
        ArrayList<Character> c = new ArrayList<Character>(str.length());
        if(str.length()!=word.length())
            return false;
        str=str.toLowerCase();
        word=word.toLowerCase();
        for(int i=0;i<word.length();i++)
                c.add(word.charAt(i));
        for(int i=0;i<str.length();i++){
            if(!c.contains(str.charAt(i)))
                return false;
        }
        return true;
    }
}
    
