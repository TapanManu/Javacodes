class Word{
    public static void main(String[] args) {
        String str="  Hello World            ";
        String newString="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                newString=newString+str.charAt(i);
            }
        }
        System.out.println(newString);
    }
}
