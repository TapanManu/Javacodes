class Transpose{
	public static void main(String [] args){
		int[][] mat=new int[][] {{1,2},{3,4},{5,6}};
		int row=3,col=2;
		for(int i=0;i<row;i++){
			System.out.println(" ");
			for(int j=0;j<col;j++){
				System.out.print(mat[i][j]+" ");
			}
		}
		for(int i=0;i<col;i++){
			System.out.println(" ");
			for(int j=0;j<row;j++){
				System.out.print(mat[j][i]+" ");
			}
		}
	}
}
