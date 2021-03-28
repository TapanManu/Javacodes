import java.util.HashMap;

public class kdistinct{
    public static void main(String[] args) {
        HashMap<Character,Integer> distinct = new HashMap<>();
        String str = "acbebi";
        char[] charset = str.toCharArray();
        int k =3;
        int maxlen = 0;
        int start = 0;
        int end = 0;
        int length = 0;
        while(end<charset.length){
            distinct.put(charset[end],distinct.getOrDefault(charset[end],0)+1);
            while(distinct.size()>k){
                distinct.put(charset[start],distinct.get(charset[start])-1);
                if(distinct.get(charset[start])==0){
                    distinct.remove(charset[start]);
                }
                start++;  
            }
            length = end - start + 1;
            if(length > maxlen){
                maxlen = length;
                System.out.println(start+":"+end);
            }
            end++;
        }
        System.out.println("maximum length:"+maxlen);
    }
}



