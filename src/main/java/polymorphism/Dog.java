package polymorphism;

public class Dog extends Animal {

    @Override
    public void makeSound() {

        System.out.println("Woof!");
    }

    @Override
    public void makeSound(String soundType) {

        System.out.println(soundType);
    }
}
