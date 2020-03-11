import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Arr{
    public static void main(String[] args) throws IOException{
        int [] values = new int[10];
        int i = 0;
        File file = new File("values.txt");
        if(file.exists()){
            Scanner inputFile = new Scanner(file);
            while(inputFile.hasNext() && i < values.length){
                values[i++]=inputFile.nextInt();
            }
            inputFile.close();
            for(int value:values){
                System.out.println(value);
            }
        }
    }
}
