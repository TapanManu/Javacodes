class Segregate{
	public static void main(String[] args){
		Boolean exchange=false;
		int[] arr = new int[]{0,1,0,1,0,1,0,1}; 
		int i=0,left=0,right=7;
		while(exchange==false){
			if((arr[i]==1) && (arr[i+1]==0)){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			i++;
			if(i==7){
				i=0;
			}
			for(left=0;arr[left]!=1;left++);
			for(right=7;arr[right]!=0;right--);
			if(left==right+1)
				exchange=true;	
		}
		for(i=0;i<8;i++){
			System.out.print(arr[i]+" ");
		}

	}
}
