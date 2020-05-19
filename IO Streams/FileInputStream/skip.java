import java.io.FileInputStream;
import java.io.IOException;

class FileIn{
public static void main(String[] args) {
		final String path = "./fileout.txt";
		try(FileInputStream fin = new FileInputStream(path)){
			fin.skip(5);

			//skip 5 bytes

			System.out.println("No of available bytes now:"+fin.available());
			int i=0;
			while((i=fin.read())!=-1){
				System.out.println((char)i);
				i=fin.read();
			}
			System.out.println("No of available bytes now:"+fin.available());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
