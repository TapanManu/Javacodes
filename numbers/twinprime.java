class Prime{
    public static void main(String[] args) {
        //ignoring the case of 2--only even prime!
        for(int i=3;i<100;i+=2)
            if(isPrime(i)&&isPrime(i+2))
                System.out.println(i+","+(i+2));
        
    }
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
