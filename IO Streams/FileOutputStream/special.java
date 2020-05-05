import java.io.FileOutputStream;
import java.io.IOException;

class FileOut{
public static void main(String[] args) throws IOException{
		final String path = "./fileout.txt";
		String content = "Write Data to FileOutputStream";
		try(FileOutputStream fout = new FileOutputStream(path)){
			fout.write(content.getBytes());
			fout.write(content.getBytes()[0]);
			fout.write(content.getBytes(),4,10);
			fout.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
