package generic;

public class NewGeneric {

    public static <T> void gen(T[] $array) {

        for (T item : $array ) {
            System.out.printf("%s " , item);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] iArray = {23,45,65,12,34};
        String[] sArray = {"namas", "butas", "sklypas", "darzas"};
        Character[] cArray = {'C', 'O', 'D', 'I', 'N', 'G'};

        gen(iArray);
        gen(sArray);
        gen(cArray);

    }
}
