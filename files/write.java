import java.io.IOException;
import java.io.PrintWriter;

class Files{
    public static void main(String[] args) throws IOException{
        PrintWriter outputFile = new PrintWriter("output.txt");
        outputFile.println("1 line");
        outputFile.println("2 line");
        outputFile.println("3 line");
        outputFile.close();
    }
}
