class Main{
	public static void main(String[] args){
		char [] arr={'3','2','1',29,'5','3'};
		int i=0;
		Boolean flag=false;
		
		for(i=0;i<arr.length;i++){
			if (arr[i].isdigit()==true){
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

//main.java:9: error: char cannot be dereferenced
			if (arr[i].isdigit()==true){
			          ^
1 error
