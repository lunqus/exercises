package Interface;

public class InterfaceTest {

    public static void main(String[] args) {

        Dog myDog = new Dog();

        myDog.setName("Pyro");

        System.out.println(myDog.getName());

    }

    /**
     *      Animal
     *        ||
     *      Canine
     *        ||
     *       Dog
     */
}
