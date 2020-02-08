import java.lang.Character;
class Main{
	public static void main(String[] args){
		char [] arr={'3','2','1',29,'5','3'};
		int i=0;
		Boolean flag=false;
		
		for(i=0;i<arr.length;i++){
			if (Character.isDigit(arr[i])==true){
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("array have a number");
		else
			System.out.println("array does not have a number");
}
}
