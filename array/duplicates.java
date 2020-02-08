class Main{
	public static void main(String[] args){
		int [] arr={3,2,1,2,5,3};
		int i=0,k=0,count=0;
		
		for (;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					arr[j]=0;
					count++;
				}
			}	
		}
		int[] result=new int[arr.length-count+1];
		for(i=0;i<arr.length;i++){
			if(arr[i]!=0)
				result[k++]=arr[i];
		}
		for (i=0;i<result.length;i++){
			System.out.println(result[i]);
		}

}
}
