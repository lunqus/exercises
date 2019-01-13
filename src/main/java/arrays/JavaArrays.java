package arrays;

public class JavaArrays {

    public static void main(String[] args) {

        // Arrays
        int[] arrInts       = {2,4,5,8};
        String[] arrStrings = {"Johna", "Arao", "Ines", "Olga", "Fina"};
        boolean[] arrBools = {true, false, true, false};


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

        System.out.println("------------ ------------");

        // New empty arrays with 5 elements (or empty spots) inside of it
        int[] newArray          = new int[5];
        String[] newStringArray = new String[5];

        // Adding elements to an Array
        newArray[0] = 3;
        newArray[1] = 4;
        newArray[2] = 6;
        newArray[3] = 1;
        newArray[4] = 12;

        newStringArray[0] = "Marcos";
        newStringArray[1] = "James";
        newStringArray[2] = "Jason";
        newStringArray[3] = "Laura";
        newStringArray[4] = "Bonni";

        System.out.println("------------ ------------");

        // Loops through newArray ant prints newly specified values

        for (int i = 0; i < newArray.length; i++) {

            System.out.println("Item # " + newArray[i]);
        }

        System.out.println("------------ ------------");

        for (int i = 0; i < newStringArray.length; i++) {

            System.out.println("Name: " + newStringArray[i]);
        }

    }

}
