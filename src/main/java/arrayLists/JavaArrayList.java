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

        System.out.println("Size: " + animals.size());
        System.out.println("----------");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Animals: " + animals.get(i));
        }

        System.out.println("----------");

        for (String animal : animals) {
            System.out.println("Animals: " + animal);
        }

        System.out.println("----------");

        animals.remove(0);
        animals.remove("Cat");

        if ( animals.isEmpty()) {
            System.out.println("Animals is empty!");
        } else {
            for (String animal : animals) {
                System.out.println("Animals: " + animal);
            }
        }

    }
}
