package polymorphism;

public class MainAnimal {

    public static void main(String[] args) {

        Animal vetDog = new Dog();

        Cat myCat = new Cat();
        Dog myDog = new Dog();

        Vet myVet = new Vet();

        myCat.makeSound("Meow ...");
        myDog.makeSound();

        myVet.doVet(myCat);
        myVet.doVet(myDog);

        vetDog.makeSound("WauWauWau!!!s");
        vetDog.makeSound();

        Animal cat = new Animal();
        System.out.println(cat.getName());

    }

}
