package scanner;

import java.util.Scanner;

public class testScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter array length: ");
        int populationOfData = scan.nextInt();

        System.out.println("Please enter data separated by spaces: ");
        String data = scan.next();
        data.trim();

        int indexWhiteSpace = data.indexOf(" ");

        int[] dataArray = new int[populationOfData];
        int tempInt = 0;

        for(int index = 0; index < populationOfData; index++)
        {
            String tempString = data.substring(0, indexWhiteSpace);
            data = data.substring(indexWhiteSpace+1, data.length());
            tempInt = Integer.parseInt(tempString);

            dataArray[index] = tempInt;
            indexWhiteSpace = data.indexOf(" ");
        }
        System.out.println(dataArray[0]);
    }
}
