package genericWild;

public class WildCard <T extends Number> {

    T[] numbers;

    WildCard(T[] $object) {

        numbers = $object;
    }

    double average() {

        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();

        }

        return sum / numbers.length;
    }

    boolean sameNumbers(WildCard<?> $object) {
        if(average() == $object.average()) {
            return true;
        } else {
            return false;
        }
    }

}
