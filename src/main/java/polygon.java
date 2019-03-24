public class polygon {



    public static void main(String[] args) {

        int sum = 0;
        int n = 2;

        for(int i = 1; i <= n - 1; i++) {

            sum = sum + 2 * i - 1;
        }

        sum = sum * 2;

        sum = sum + 2 * n - 1;

        System.out.println(sum);
    }
}
