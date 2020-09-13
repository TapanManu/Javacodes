class Traverse{
	public static void main(String[] args) {
		int n=3;
		int j=0;
		//O(n) traversing!!!!!!
		int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;;i++){
			
			if(i%n==0 && i>0){
				System.out.println();
				j++;
				if(j%n==0){
					break;
				}
			}
			System.out.print(arr[j][i%n]+" ");
		}
	}
}
