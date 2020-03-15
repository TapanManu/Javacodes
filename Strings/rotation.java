class Rotate{
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="BCDA";
        str1=str1+str1;
        if(str1.contains(str2)&&str1.length()==str2.length())
            System.out.println("rotation of strings");
        else
            System.out.println("no rotation");
    }
}
