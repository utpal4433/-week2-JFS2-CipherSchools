import java.io.File;
import java.io.IOException;

public class File_handling_1 {
    public static void main(String[] args) {
        File f = new File("/Users/utpal/Desktop/TestFile.txt");
        try{
            f.createNewFile();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("File succesfully created");
    }
}
