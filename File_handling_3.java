import java.io.FileWriter;
import java.io.IOException;

public class File_handling_3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/shivansh/Desktop/TestFile.txt",true);

        fw.write("I am the earth\n");
        fw.write("I am the forest green\n");
        fw.write("I am the four winds blowing\n");
        fw.write("I am the earth\n");
        fw.flush();
        fw.close();
        System.out.println("File is prepared successfully");
    }
}
