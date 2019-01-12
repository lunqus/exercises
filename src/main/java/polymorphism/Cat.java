package polymorphism;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        // super.makeSound();
        System.out.println("Purr!");
    }
}
