package ioStream;

import java.io.*;

public class ReadFile { // Here we dealing with characters and strings

    public static void main(String[] args) {

        File file = new File("src/main/java/ioStream/Test.txt");

        try (FileReader fileReader = new FileReader(file)) {

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
