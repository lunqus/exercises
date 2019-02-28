package polymorphism;

public class Animal {


    public void makeSound() {

        System.out.println("Grrrr!!!");
    }

    public void makeSound(String soundType) {

        System.out.println(soundType);
    }

}
