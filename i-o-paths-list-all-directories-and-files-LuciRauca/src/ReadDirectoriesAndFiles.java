import java.io.File;

public class ReadDirectoriesAndFiles {

    public static void main(String a[]){
        File file = new File("C:\\Users\\Luci\\Welcome");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
    }

}
