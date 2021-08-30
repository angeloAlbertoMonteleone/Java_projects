import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        String file = "\\test-file.txt";
        String dir = "C:\\Users\\angel\\Desktop\\HTDOCS\\Java\\test-dir";
        m.createDirectory(dir);
        m.createFile(dir+ "\\test-file.txt");

        File d = new File(dir);
        System.out.println(d.isDirectory());

        File f = new File(file);
        System.out.println(f.isFile());

        File[] files = d.listFiles();
        for (File file2: files){
            System.out.println(file2.getName());
//            file2.delete();
        }
    }

    public void createFile(String path){
        File f = new File(path);
        if(!f.exists()){
            try {
                f.createNewFile();
            }catch (IOException error){
                error.printStackTrace();
            }
        }
    }

    public void createDirectory(String path) {
        File d = new File(path);

        if(!d.exists()){
            d.mkdir();
        }
    }




}
