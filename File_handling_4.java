import java.io.File;

public class File_handling_4 {
    public static void main(String[] args) {
        File f = new File("/Users/utpal/Downloads/dataset");

        String[] files = f.list();
        for(String file: files){
            System.out.println(file);
        }
        File[] files_arr = f.listFiles();
        for(File ff : files_arr){
            ff.delete();
        }
    }
}
