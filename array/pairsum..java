import java.lang.Character;
class Main{
	public static void main(String[] args){
		int [] arr={3,2,1,29,1,3};
		int i=0,j=0,first=0,second=0;
		int num=7;
		Boolean flag=false;
		for(i=0;i<arr.length;i++){
			first=arr[i];
			for(j=i+1;j<arr.length;j++){
				second=arr[j];
				if(first+second==num){
					flag=true;
					System.out.print("("+first+","+second+")");
				}
			}
		}
		if(flag==false){
			System.out.print("no such pair whose sum is equal to given Number");
		}
}
}
