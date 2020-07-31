import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;

class Shuffle{
	public static void main(String[] args) throws IOException{
		ArrayList<String> str = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("shuffle.txt"));
		String line;
		while((line=br.readLine())!=null){
			str.add(line);
		}
		br.close();
		FileWriter w = new FileWriter("shuffle.txt");
		Collections.shuffle(str);
		w.write(str.get(0)+"\n");
		w.close();
		FileWriter ow = new FileWriter("shuffle.txt",true);
		for(int i=1;i<str.size();i++)
			ow.write(str.get(i)+"\n");
		ow.close();
	}
}