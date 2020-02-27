class Recurse{
    static int count=0;
    public static void main(String[] args) {
       int num=8000070;
       System.out.println(recurse(num)); 
    }
    public static int recurse(int x){
        if(x==0){
            return count;
        }
        if (x%10==0){
            count++;
        }
        return recurse(x/10);
    }
}
