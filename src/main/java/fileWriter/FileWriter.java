package fileWriter;

import java.io.File;
import java.io.IOException;

public class FileWriter {


    public FileWriter(File file) {

    }

    public static void main(String[] args) {

        try {
            write("hello");
        } catch(IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void write(String text) throws IOException {

        File file = new File("file.txt");
        FileWriter wr = new FileWriter(file);

    }



}
