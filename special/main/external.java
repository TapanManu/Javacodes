class External{
    static int count=0;
    static void getMain(){
        String[] args={"anagram.java"};
        if(count++<5) main(args);
    }
    public static void main(String[] args){
        System.out.println("java");
        getMain();
        System.out.println("perfect run");
    }
}
