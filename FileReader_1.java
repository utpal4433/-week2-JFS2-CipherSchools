import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class FileReader_1 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("/Users/utpal/Desktop/text.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        fr.close();
    }
}
