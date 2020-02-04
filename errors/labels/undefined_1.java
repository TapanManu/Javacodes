import java.util.Scanner;
class ErrorTest{
	public static void main(String[] args){
		int i=1,j=1,k=1;
		l1:{
			i++;
			System.out.println(i);
		}
		l2:{
			j++;
			System.out.println(j);
		}
		l3:{
			k++;
			System.out.println(k);
			break l2;
		}
}
}
