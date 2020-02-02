class Transpose{
	public static void main(String [] args){
		int[][] mat=new int[][] {{1,2},{3,4},{5,6}};
		int[][] trans= new int[2][3];
		int row=3,col=2;
		for(int i=0;i<=row;i++){
			for(int j=0;j<=col;j++){
				trans[i][j]=mat[j][i];
			}
		}
		for(int i=0;i<col;i++){
			System.out.print(" ");
			for(int j=0;j<row;j++){
				System.out.print(mat[j][i]+" ");
			}
		}
	}
}
