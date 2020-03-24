import java.lang.Exception;
class Sudoku{
	public static final int rowsize=9;
	public static final int colsize=9;
	Sudoku(){
		
	}
	//check valid size of matrix
	static void checkSize(int r,int c){
		if(r<9 || c<9)
			throw new ArrayIndexOutOfBoundsException("less than required size");
	}

	//checks whether element is valid within sudoku puzzle
	static void checkElement(int[][] arr){
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
				if(arr[i][j]>9 || arr[i][j]<1)
					throw new ArrayIndexOutOfBoundsException("incorrect elements");
	}

	//checks duplication of element rowwise and colwise
	static Boolean checkRowCol(int[][] arr){
		int i=0,rcount=0,ccount=0;
		int k=1;
		for(int j=0;j<9;j++){
			if(i==9)
				return true;
			if(arr[i][j]==k)
				rcount++;
			if(arr[j][i]==k)
				ccount++;
			if(rcount>1||ccount>1)
				return false;

			if(k==9 && j==8){
				i++;
				j=0;
				k=1;
				rcount=0;
				ccount=0;
			}
			if(j==8){
				k++;
				j=0;
				rcount=0;
				ccount=0;
			}
		}
		return true;
	}
	
	//in each squares of 3x3 matrix
	static Boolean checkSqaure(int [][] s){
		for(int row = 0; row < 9; row += 3)
   			for(int col = 0; col < 9; col += 3)
      // row, col is start of the 3 by 3 grid
      			for(int pos = 0; pos < 8; pos++)
         			for(int pos2 = pos + 1; pos2 < 9; pos2++)
            			if(s[row + pos%3][col + pos/3]==s[row + pos2%3][col + pos2/3])
               				return false;
         return true;
	}
	
	public static void main(String[] args) {
		int [][] sudoku_matrix = {{6,2,9,1,7,8,4,3,5},
								  {8,4,5,3,6,2,7,9,1},
								  {1,3,7,5,9,4,8,2,6},
								  {2,7,8,6,4,3,5,1,9},
								  {3,9,1,2,8,5,6,7,4},
								  {4,5,6,7,1,9,2,8,3},
								  {9,6,3,8,5,7,1,4,2},
								  {5,8,4,9,2,1,3,6,7},
								  {7,1,2,4,3,6,9,5,8}};
		Sudoku ob = new Sudoku();



		try{
			checkSize(sudoku_matrix.length,sudoku_matrix[0].length);
			checkElement(sudoku_matrix);
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println(a.getMessage());
		}
		finally{
			System.out.println("done!");
		}
		if(checkRowCol(sudoku_matrix))
			System.out.println("correct!");
		if(checkSqaure(sudoku_matrix))
			System.out.println("correct again!");
	}
}
