import java.io.FileInputStream;
import java.io.IOException;

class FileIn{
public static void main(String[] args) {
		final String path = "./fileout.txt";
		try(FileInputStream fin = new FileInputStream(path)){
			System.out.println("No of available bytes at beginning:"+fin.available());
			fin.read();
			fin.read();
			System.out.println("No of available bytes now:"+fin.available());
			while(fin.read()!=-1){
				fin.read();
			}
			System.out.println("No of available bytes now:"+fin.available());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

//OUTPUT
No of available bytes at beginning:41
No of available bytes now:39
No of available bytes now:0
