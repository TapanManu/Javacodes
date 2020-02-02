class Exchange{
	public static void main(String[] args){
		int arr[][]=new int[][]{{1,2},{3,4},{5,6}};
		int temp=0;
			for(int j=0;j<arr[0].length;j++){
				temp=arr[1][j];
				arr[1][j]=arr[2][j];
				arr[2][j]=temp;
			}
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[0].length;j++){
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
