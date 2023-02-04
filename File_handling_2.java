import java.io.File;

public class File_handling_2 {
    public static void main(String[] args) {
        File f = new File("/Users/utpal/Desktop/TestFile.txt");

        if(f.exists()){
            System.out.println("Printing file details");
            System.out.println("----------------------");
            System.out.println("File Name : "+f.getName());
            System.out.println("File Size : "+f.length());
            System.out.println("File paths : "+f.getAbsolutePath());
            System.out.println("is File readable : "+f.canRead());
            System.out.println("is File writable : "+f.canWrite());
            System.out.println("----------------------");

        }
        File f1 = new File("/users/shivansh/Desktop/avengers");
        f1.mkdir();
    }
}
