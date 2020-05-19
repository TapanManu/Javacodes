import java.io.FileInputStream;
import java.util.Arrays;

class FileIn{
public static void main(String[] args) {
		byte[] bytes = new byte[100];
		try(FileInputStream fin = new FileInputStream("fileout.txt")){
			System.out.println("bytes:"+fin.available());
			int bytesread = fin.read(bytes,10,20);
			System.out.println("read bytes:"+bytesread);
			System.out.println(Arrays.toString(bytes));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
