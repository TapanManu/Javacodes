import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Files{
    public static void main(String[] args) throws IOException{
        File file = new File("output.txt");
        if (file.exists()){
            System.out.println("file exists");
            Scanner inputfile = new Scanner(file);
            System.out.println(inputfile.nextLine());
            System.out.println(inputfile.nextLine());
            System.out.println(inputfile.nextLine());

            //System.out.println(inputfile.nextLine()
            //NoSuchElementException
            inputfile.close();
        }
    }
}
