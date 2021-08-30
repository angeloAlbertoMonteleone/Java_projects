import java.io.*;

public class Writing {

    public static void main(String[] args) {

        String dir = "C:\\Users\\angel\\Desktop\\HTDOCS\\Java\\test-dir\\";

        Writing writing = new Writing();

        writing.exampleFileWriter(dir+"file-text.txt", "Lorem ipsum.....");

        writing.bufferedFileWriter(dir+"buffered-writer.txt",
                new String[] {"Angelo", "Alberto", "Java course"});
    }

    public void printWriter(String filePath, String... text) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileWriter(getFile(filePath)));
            for (String string : text){
                printWriter.write(string);
                //you can add other types of object, printWriter.println(obj...)
            }
        }catch (IOException error){
            error.printStackTrace();
        } finally {
            printWriter.close();
        }

    }

    public void bufferedFileWriter(String filePath, String... text) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(getFile(filePath)));
            for (String string : text){
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }

        }catch (IOException error){
            error.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            }catch (IOException error){
                error.printStackTrace();
            }
        }
    }

    public void exampleFileWriter(String filePath, String text) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(getFile(filePath));
            fileWriter.write(text);
        }catch (IOException error){
            error.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            }catch (IOException error){
                error.printStackTrace();
            }
        }
    }


    private File getFile(String filePath){
        File file = new File(filePath);
        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException error){
                error.printStackTrace();
            }
        }

        return file;
    }
}
