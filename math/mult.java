class Mult{
	public static void main(String[] args){
		int i,j;
		for(i=0;;i++){
			for(j=1;;j++){
				int p=i*j;
				System.out.println(i + "*" + j + "=" + p);
				if(j==10)break;
			}
			if(i==10)break;
		}

}
}
