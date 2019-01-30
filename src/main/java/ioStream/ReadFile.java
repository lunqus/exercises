package ioStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile { //

    public static void main(String[] args) {

        File file = new File("src/main/java/ioStream/Test.txt");

        try (FileReader fileReader = new FileReader()) {

            BufferedReader bufferedReader = new BufferedReader(fileReader);

        }
    }
}
