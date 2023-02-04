import java.io.*;
public class Exception_handling_1 {
    public static void main(String[] args) {
        try{
            File f  =new File("d:\\documents.txt");
            f.createNewFile();
        }
        catch (Exception e){};
    }
}
