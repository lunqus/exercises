package ioStream;

import java.io.*;

public class WriteToFile {

    public static void main(String[] args) {

        File file = new File("src/main/java/ioStream/MyTest.txt");

        try ( FileWriter fileWriter = new FileWriter(file) ) {

            fileWriter.write("Today is a good day indeed ... ");
            fileWriter.close();

            // Read it all back to us
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
