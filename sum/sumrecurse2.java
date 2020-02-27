class Recurse{
    public static void main(String[] args) {
       int num=5;
       System.out.println(recurse(num)); 
    }
    public static int recurse(int x){
        if(x==1){
            return 1;
        }
        return x + recurse(x-1);
    }
}
//output 15
