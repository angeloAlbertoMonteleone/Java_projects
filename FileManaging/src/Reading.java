import java.io.*;
import java.util.logging.FileHandler;

public class Reading {
    public static void main(String[] args) {
        String dir = "C:\\Users\\angel\\Desktop\\HTDOCS\\Java\\test-dir\\";

        Reading reading = new Reading();
        reading.exampleBufferedReader(dir+"file-text.txt");


    }

    public void exampleFileReader(String filepath){
        File file = new File(filepath);

        if(file.exists()){
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(file);

                char[] text = new char[1024]; //limit is 1024 char to read

                int size = fileReader.read(text);

                for (int i = 0; i < size; i++){
                    System.out.print(text[i]);
                }

            }catch (FileNotFoundException error){
                error.printStackTrace();
            }catch (IOException error ){
                error.printStackTrace();
            } finally {
                try {
                    fileReader.close();
                }catch (IOException error){
                    error.printStackTrace();
                }
            }
        }
    }

    public void exampleBufferedReader(String filepath){
        File file = new File(filepath);

        if(file.exists()){
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(file));

                char[] text = new char[1024]; //limit is 1024 char to read

                int size = bufferedReader.read(text);

                for (int i = 0; i < size; i++){
                    System.out.print(text[i]);
                }

            }catch (FileNotFoundException error){
                error.printStackTrace();
            }catch (IOException error ){
                error.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                }catch (IOException error){
                    error.printStackTrace();
                }
            }
        }
    }
}
