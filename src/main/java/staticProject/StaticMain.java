package staticProject;

public class StaticMain {

    public static void main(String[] args) {

        int myValue = -45;
        int secondValue = 56;

        int x = Math.min(myValue, secondValue);
        int y = Math.abs(myValue);

        System.out.println("X Min: " + x + ", Y Abs: " + y );

    }
}
