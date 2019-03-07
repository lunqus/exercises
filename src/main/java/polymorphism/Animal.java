package polymorphism;

public class Animal {

    private String name = "Animal name";

    public String getName() {
        return name;
    }

    public void makeSound() {

        System.out.println("Grrrr!!!");
    }

    public void makeSound(String soundType) {

        System.out.println(soundType);

    }

}
