class Solution {
    public int strStr(String haystack, String needle) {
        int j=0;
        int first=-1;
        char[] hay = haystack.toCharArray();
        char[] ndl = needle.toCharArray();
        if(ndl.length==0) return 0;
        if(ndl.length>hay.length)
            return first;
        for(int i=0;i<hay.length;i++){

            if(hay[i]==ndl[j]){
                if(j==0)
                    first=i;
                j++;
            }
            else{  
                j=0;
            }
            if(j==ndl.length){
                 return first;
            }
               
            
        }
        return -1;
        
    }
}
