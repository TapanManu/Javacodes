class Recurse{
    public static void main(String[] args) {
       int num=1001;
       int rev=recurse(0,num);
       System.out.println(rev);
       if(num==rev)
            System.out.println("palindrome");
       else
            System.out.println("not palindrome");

    }
    public static int recurse(int rev,int x){
        if(x==0){
            return rev;
        }
        return recurse(rev*10+x%10,x/10);
    }
}
