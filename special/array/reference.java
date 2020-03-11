class CompArray{
    public static void main(String[] args) {
        int[] num={1,2,3};
        int [] num1 = num;
        num1[1]=4;
        if (num == num1){
            System.out.println("equal");
        }
        printArray(num);
        System.out.println();
        printArray(num1);

    }
    public static void printArray(int[] array){
        for (int value:array){
            System.out.print(value+" ");
        }
    }
}
//equals
// 1 4 3
// 1 4 3
