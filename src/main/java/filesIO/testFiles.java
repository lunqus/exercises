package filesIO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testFiles {

    public static void main(String[] args) throws IOException {

        List myList = new ArrayList();

        String line;

        FileReader fw = new FileReader("src/main/java/filesIO/myfile.txt");

        BufferedReader br = new BufferedReader(fw);


        try {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                myList.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String string = String.join(" ", myList);
        String str = string.replaceAll("\\s+","");
        //string.split("");
        char[] charArr = str.toCharArray();

        // List listArray = readByJava8("src/main/java/filesIO/myfile.txt");
        for(char i : charArr){
            System.out.println(i);
        }

        // System.out.println(myList);

    }

}
