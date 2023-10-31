// abstract class
abstract class Animal {
    // abstract method (does not have a body)
    public abstract void animalSound();
    // regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// subclass (inherits from Animal)
class Cat extends Animal {
    public void animalSound() {
        // the body of animalSound() is provided here
        System.out.println("The cat says: meow meow");
    }
}

// subclass (inherits from Animal)
class Dog extends Animal {
    public void animalSound() {
        // the body of animalSound() is provided here
        System.out.println("The dog says: bow wow");
    }
}

public class ExampleAC1 {
    public static void main(String[] args) {
        Cat myCat = new Cat(); // create a Cat object
        myCat.animalSound();
        myCat.sleep(); // call the sleep method

        Dog myDog = new Dog(); // create a Dog object
        myDog.animalSound();
        myDog.sleep(); // call the sleep method
    }
}
