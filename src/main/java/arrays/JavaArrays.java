package arrays;

public class JavaArrays {

    public static void main(String[] args) {

        // Arrays
        int[] arrInts       = {2,4,5,8};
        String[] arrStrings = {"Johna", "Arao", "Ines", "Olga", "Fina"};
        boolean [] arrBools = {true, false, true, false};


        // Retrieves values by the index
        System.out.println(arrInts[3]);

        System.out.println("------------ ------------");

        // Loops through and prints int values
        for (int i = 0; i < arrInts.length; i++) {

            System.out.println("Item #: " + arrInts[i]);
        }

        System.out.println("------------ ------------");

        // Prints out String values
        for (int i = 0; i < arrStrings.length; i++) {

            System.out.println("My Siblings: " + arrStrings[i]);
        }

        System.out.println("------------ ------------");

        // Loops through boolean array ant prints out boolean values
        for (int i = 0; i < arrBools.length; i++) {

            System.out.println("Output: " + arrBools[i]);
        }

    }

}
