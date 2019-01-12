package polymorphism;

public class Dog extends Animal {

    private String name;

    public void move() {
        System.out.println("Move!");
    }

    // Override makeSound function from our parent class
    @Override
    public void makeSound() {
        // super.makeSound();
        System.out.println("Woof!");
    }

    @Override
    public void makeSound(String soundType) {
        // super.makeSound(soundType);
        System.out.println(soundType);
    }
}
