import java.util.Random;
class Matrix{
    int row;
    int col;
    Matrix(int n){
        row=col=n;
    }
    Matrix(int m,int n){
        row=m;
        col=n;
    }
    void disp(){
        Random random = new Random();
        for(int i=0;i<row;i++){
            System.out.println();
            for(int j=0;j<col;j++){
                System.out.print(random.nextInt(2)+" ");
            }
        }
    }
    public static void main(String[] args) {
        Matrix mat = new Matrix(10);
        mat.disp();
    }
}
