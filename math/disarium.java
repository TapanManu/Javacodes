class Disarium{
    public static void main(String[] args) {
        int num = 135;
        int temp = num;
        int cnt,n=1;
        for(cnt = 0,n=1;n<num;cnt++,n*=10);
        int sum=0;
        while(num!=0){
            sum+=Math.pow(num%10,cnt--);
            num/=10;
        }
        if(sum==temp){
            System.out.println("disarium");
        }
        else{
            System.out.println("not disarium");
        }
    }
}
