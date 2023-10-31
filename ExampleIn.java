// Define an interface
interface Animal {
    public void makeSound(); // Abstract method
}

// Implement the interface
class Dog implements Animal {
    public void makeSound() {
        // The body of makeSound() is provided here
        System.out.println("Woof! Woof!");
    }
}

// Implement the interface
class Cat implements Animal {
    public void makeSound() {
        // The body of makeSound() is provided here
        System.out.println("Meow! Meow!");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();  // Create a Dog object
        myDog.makeSound();     // Call the makeSound() method

        Cat myCat = new Cat();  // Create a Cat object
        myCat.makeSound();     // Call the makeSound() method
    }
}
