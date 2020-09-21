class Solution {
    public static ArrayList<String> palindrome = new ArrayList<>();
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        for(int i=0;i<s.length();i++){
            String temp;
            if(i==s.length()-1){
                break;
            }
            //use indexOf()fn if needed
            char start =  s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(start == s.charAt(j)){
                   temp = s.substring(i,j+1); 
                    System.out.println(temp);
                   if(isPal(temp.toCharArray(),0))
                       palindrome.add(temp);
                }
            }
        }
        int max=0;
        String lp="";
        for(String p:palindrome){
            //System.out.println(p);
            if(p.length()>max){
                lp=p;
                max=p.length();
            }
        }
        if(lp=="")
            lp=String.valueOf(s.charAt(0));
        return lp; 
    }
    public static boolean isPal(char[] str,int i){
        if(str[i]!=str[str.length-i-1])
            return false;
        if(i==str.length/2)
            return true;
        return isPal(str,++i);        
    }
}
