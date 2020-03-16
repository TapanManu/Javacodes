class Matrix{
    private int row;
    private int col;
    private int[][] arr ;

    Matrix(int n){
        row=col=n;
        arr=new int[row][col];
    }
    Matrix(int m,int n){
        row=m;
        col=n;
        arr=new int[row][col];
    }
    public void input(){
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=i+j;//just sample!
            }
        }
    }
    public void disp(){
            for(int i=0;i<row;i++){
            System.out.println();
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
    public void add(Matrix m1,Matrix m2){
        if(m1.row==m2.row && m1.col==m2.col)
            for(int i=0;i<m1.row;i++)
                for(int j=0;j<m1.col;j++)
                    this.arr[i][j]=m1.arr[i][j]+m2.arr[i][j];//just sample!
        else
            System.out.println("cannot be added");
    }
    public static void main(String[] args) {
        Matrix mat1 = new Matrix(3,3);
        mat1.input();
        mat1.disp();
        Matrix mat2 = new Matrix(3,3);
        mat2.input();
        mat2.disp();
        Matrix mat3 = new Matrix(3,3);
        mat3.add(mat1,mat2);
        mat3.disp();
    }
}
