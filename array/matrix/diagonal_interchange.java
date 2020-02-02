class Interchange{
	public static void main(String[] args){
		int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int temp=0,size=3;
			for(int i=0;i<arr.length;i++){
					temp=arr[i][size-i-1];
					arr[i][size-i-1]=arr[i][i];
					arr[i][i]=temp;
			}
			for(int i=0;i<arr.length;i++){
				System.out.println(" ");
				for(int j=0;j<arr[0].length;j++){
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
