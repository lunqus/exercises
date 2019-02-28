package genericWild;

public class WildCardMain {

    public static void main(String[] args) {

        Integer[] intArray = {23, 45, 64, 2, 90, 58};
        WildCard<Integer> intArrayObject = new WildCard<>(intArray);
        double intArrayAve = intArrayObject.average();
        System.out.println("intArray average: " + intArrayAve);

        Float[] floatArray = {1.9F, 7.9F, 6.0F, 4.8F, 8.1F};
        WildCard<Float> floatArrayObject = new WildCard<>(floatArray);
        double floatArrayAve = floatArrayObject.average();
        System.out.println("floatArray average: " + floatArrayAve);

        System.out.println("---");

        if (intArrayObject.sameNumbers(floatArrayObject)) {
            System.out.println(intArrayObject + " and " + "They're the same!");
        } else {
            System.out.println(intArrayObject + " and " + "they're diferrent!");
        }
    }
}
