import java.io.FileOutputStream;
import java.io.IOException;

//Flush demo


class Sample{
	public static void main(String[] args) throws IOException{
		try{
		FileOutputStream out = new FileOutputStream("flush.txt");
		String s = "Demo of flush";
		byte b[] = s.getBytes();
		out.write(b);
		out.flush();
		out.close();
		System.out.println("Success");
		} 
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
/*
The method flush is used to "flush" bytes retained in a buffer.
 FileOutputStream doesn't use any buffer, so flush method is empty. 
Calling it or not doesn't change the result of your code.
 With buffered writers the method close call explicitly flush .
 */
