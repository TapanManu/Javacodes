class Matrix{
    public static void main(String[] args) {
        int i,j,k=0;
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int result[][]=new int[arr.length*2][arr[0].length];
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[0].length;j++){
                k=i+j;
                //System.out.print(i+j);
                result[k][i]=arr[i][j];
            }
        }
        System.out.println("result");
        for(i=0;i<result.length;i++){
            System.out.println(" ");
            for(j=0;j<result[0].length;j++)
                if(result[i][j]!=0)
                 System.out.print(result[i][j]+" ");
        }
        
    }
}