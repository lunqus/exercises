package polymorphism;

public class MainAnimal {

    public static void main(String[] args) {

        Vet myVet = new Vet();

        Cat myCat = new Cat();
        Dog myDog = new Dog();

        myVet.giveShot(myCat);
        myVet.giveShot(myDog);

//        myDog.makeSound();
//        myDog.makeSound("Wooff!");
//        myDog.makeSound("Woof", "very loud!");

//        myDog.move();
//        myDog.makeSound("another Woof!");

    }

}
