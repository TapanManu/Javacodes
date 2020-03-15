class Permute{
    public static void main(String[] args) {
        String str="GOD";
        permutation(str,0);
    }
    
    public static String swap(String str,int i,int j){
        char[] array = str.toCharArray();
        char temp = array[i];
        array[i] = array[j];
        array[j] =  temp;
        return String.valueOf(array);        

    }
    public static void permutation(String str,int count){
        for(int i=count;i<str.length();i++){
             str=swap(str,count,i);
             permutation(str,count+1);
             str=swap(str,count,i);
        }
        if(count==str.length()-1)
            System.out.println(str);
    }
}
