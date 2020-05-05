import java.io.FileOutputStream;


//Writing a byte to FileOutputstream


class Sample{
	public static void main(String[] args) {
		try{
		FileOutputStream f = new FileOutputStream("testout.txt");
		String s = "How are You?";
		byte b[] = s.getBytes();
		f.write(b);
		f.close();
		System.out.println("Success");
		} 
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
