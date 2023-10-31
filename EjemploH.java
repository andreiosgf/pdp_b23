// Parent class
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println("The animal is eating");
    }

    public String getName(){
        return name;
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    public Dog(String nameD) {
        super.name=nameD;
    }
    public void bark() {
        System.out.println("The dog is barking");
    }
}

// Child class inheriting from Animal
class Cat extends Animal {
    public Cat(String nameC) {
        super.name=nameC;
    }
    public void meow() {
        System.out.println("The cat is meowing");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Perro");
        myDog.eat(); // Output: The animal is eating
        myDog.bark(); // Output: The dog is barking

        Cat myCat = new Cat("Gato");
        myCat.eat(); // Output: The animal is eating
        myCat.meow(); // Output: The cat is meowing
    }
}
