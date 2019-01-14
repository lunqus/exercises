package hashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
        System.out.println("---------");

        System.out.println("Entire values: " + users.entrySet());
        System.out.println("---------");

        Iterator it = users.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();

            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
        System.out.println("---------");

        HashMap<String, Integer> newUser = new HashMap<>();

        newUser.put("Sue", 34);

        System.out.println("Sue");
    }
}
