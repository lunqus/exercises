package autoboxing;

import java.util.ArrayList;

public class AutoboxingMain {

    // Primitive:       int, chars, long, float, double, boolean, byte ...
    // Object types:    Integer, Character, Long, Float, Double, Boolean, Byte ...


    int i = 32;

    // Autoboxing happens automatically
    ArrayList<Integer> myArray = new ArrayList();

    public void setMyArray(ArrayList<Integer> myArray) {
        this.myArray = myArray;
        myArray.add(i);
    }

    int myItem = myArray.get(0);

    int b = 23;

    //Physically wrapping my int primitive variable.
    Integer myObject = new Integer(b);

    //Unwrapping the Integer object
    int recoverInt = myObject.intValue();
}
