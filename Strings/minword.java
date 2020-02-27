class Word{
    static int count=0;
    static int min=999;
    static String word;
    public static void main(String[] args) {
        String s = "abc a b c def ghijk";
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(count<min){
                    min=count;
                    word=s.substring(i-count,i);
                }
                count=0;
            }
            else{
                count++;    
            }
        }
        System.out.println(word);
    }
}
//the function returns the minimum word in java
//output
//a
