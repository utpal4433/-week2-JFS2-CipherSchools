import java.io.File;
import java.io.IOException;

public class Exception_handling_4 {
    public static void main(String[] args) throws IOException {

        File f = new File("d:\\documents.txt");
        f.createNewFile();
    }
}
