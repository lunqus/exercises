package hashMaps;

import java.util.HashMap;

public class HashMapsMain {

    public static void main(String[] args) {

        HashMap users = new HashMap<>();

        users.put("Kealy", 34);
        users.put("Bonni", 25);

        if (users.containsKey("life")) {
            System.out.println("Yeh!");
        } else {
            System.out.println("Nay!");
        }

        System.out.println(users.get("Kealy"));
        System.out.println(users.get("Bonni"));

        System.out.println("---------");

        System.out.println("Values: " + users.values());


    }
}
