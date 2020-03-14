import java.util.ArrayList;
class Sent{
    public static void main(String[] args) {
        String s = "I am happy";
        int j=1,k=0;
        ArrayList <Integer> c= new ArrayList<Integer>(s.length());
        ArrayList <String> str= new ArrayList<String>(s.length());
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==' ')
                c.add(i);
        int i=0;
        for(j=0;j<s.length();j++){
            if(i<c.size()){
            if(j==c.get(i)){
                str.add(s.substring(k,j));
                k=c.get(i++)+1;
            }
        }
        }
        str.add(s.substring(k,s.length()));
        System.out.println(str);   //each individual words
        String rev="";
        for(i=str.size()-1;i>=0;i--)
            rev=rev+" "+str.get(i);
        System.out.println(rev);
    }
}
