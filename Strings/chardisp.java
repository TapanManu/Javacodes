class Char{
    public static void main(String[] args) {
        char ch1 ='(';
        char ch2 = 'z';
        int count=0;
        for(char ch=ch1;ch<=ch2;ch++){
                System.out.print(ch);
                if(++count==20){
                    System.out.println();
                    count=0;
                }
        }
        
}
}
