import java.io.FileOutputStream;

class Sample{
	public static void main(String[] args) {
		try{
		String s = "Demo of FileOutputBuffer writing with offset and other data.Nothing More...";
		byte b[] = s.getBytes();

		//getting every byte from example
		FileOutputStream out1 = new FileOutputStream("testout.txt");
		for(int i=0;i<b.length;i+=2)
			out1.write(b[i]);
		out1.close();

		//writing buffer to output stream
		FileOutputStream out2 = new FileOutputStream("testout1.txt");
		out2.write(b);
		out2.close();

		//writing buffer from specified offset and specified length
		FileOutputStream out3 = new FileOutputStream("testout2.txt");
		out3.write(b,b.length-b.length/4,b.length/4);
		out3.close();

		System.out.println("Success");
		} 
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
