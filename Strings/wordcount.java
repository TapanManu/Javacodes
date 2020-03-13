class Char{
    //O(1) WordCount
    public static void main(String[] args) {
        String str = "Hello World! AB CD EF";
        int word=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                if(i==0)
                    continue;
                else
                    word+=1;
        }
        System.out.println(++word);
        
}
}
