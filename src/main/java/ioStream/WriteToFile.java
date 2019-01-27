package ioStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {

        File file = new File("src/main/java/ioStream/MyTest.txt");

        try ( FileWriter fileWriter = new FileWriter(file) ) {

            fileWriter.write("This is amazing ... ");
            fileWriter.close();

            // Read it all back to us


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
