class Recurse{
    public static void main(String[] args) {
       int num=98070;
       System.out.println(recurse(num)); 
    }
    public static int recurse(int x){
        if(x==0){
            return 0;
        }
        return x%10+recurse(x/10);
    }
}
