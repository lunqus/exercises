package fileWriter;

import java.io.File;
import java.io.IOException;

public class FileWriter {

    public FileWriter(File file, boolean b) {}

    public static void main(String[] args) {

        try {
            write("hello");
        } catch(IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static void write(String text) throws IOException {
        File file = new File("/Users/lunkus/IdeaProjects/exercises/src/main/java/fileWriter/file.txt");
        file.setWritable(true);
        file.setReadable(true);
        FileWriter writer = new FileWriter(file, true);

    }



}
