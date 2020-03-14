class Arr{
    public static void main(String[] args) {
        int [][] arr={new int[1],new int[2],new int[3]};
        arr[0][0]=32;
        arr[1][0]=500;arr[1][1]=300;
        arr[2][0]=39;arr[2][1]=45;arr[2][2]=600;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            System.out.println("array length :"+arr[i].length);
            
        }
