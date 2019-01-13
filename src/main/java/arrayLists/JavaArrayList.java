package arrayLists;

import java.util.ArrayList;

public class JavaArrayList {

    public static void main(String[] args) {
        // Array Lists

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Cat");
        animals.add("Donkey");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Animals: " + animals.get(i));
        }

        System.out.println("Size: " + animals.size());
    }
}
