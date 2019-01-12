package polymorphism;

public class Animal {
    private String name;

    public void makeSound() {
        System.out.println("grrrr");
    }

    public void makeSound(String soundType) {
        System.out.println(soundType);
    }

}
