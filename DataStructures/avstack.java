class RCount{
    //stack size may vary depending on current available memory
    static int count=0;
    public static void main(String[] args) {
        try{
        recurseCount();
        }
        catch(StackOverflowError e){
            System.out.println("size of available stack:"+count);
        }
    }
    public static void recurseCount(){
        ++count;
        recurseCount();
    }
}
