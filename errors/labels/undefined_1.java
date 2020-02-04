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
			//break l2;
		}
		l3:{
			k++;
			System.out.println(k);
			break l2;
			//out of scope results in undefined label
		}
}
}
