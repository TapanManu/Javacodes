import java.io.FileInputStream;
import java.io.IOException;

class FileIn{
public static void main(String[] args) {
		final String path = "./fileout.txt";
		try(FileInputStream fin = new FileInputStream(path)){
			int i= fin.read();
			while(i!=-1){
				System.out.println((char)i);
				i=fin.read();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
