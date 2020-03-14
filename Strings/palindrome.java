class Palindrome{
    public static void main(String[] args) {
       String str = "Malayalam";
       if(palindrome(str.toLowerCase(),0,str.length()-1)){
            System.out.println("palindrome");
       }
       else
            System.out.println("not palindrome");

    }
    public static Boolean palindrome(String str,int i,int j){
        if(i==str.length()/2)
                return str.charAt(i)==str.charAt(j);
        if(palindrome(str,++i,--j)){
            return str.charAt(i)==str.charAt(j);
        }
        return false;
    }
}
