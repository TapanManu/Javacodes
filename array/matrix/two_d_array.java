class Traverse{
	static int n=3;

	//O(1) traversal of 2d array recursively
	static void traverse(int [][] arr,int i,int j){
		if(j%n==0 && j>0){
			System.out.println();		
			i++;
			if(i%n==0 && i>0){
				return ;
			}
		}
		System.out.print(arr[i%n][j%n]+" ");
		traverse(arr,i,++j);
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		traverse(arr,0,0);
	}
}
