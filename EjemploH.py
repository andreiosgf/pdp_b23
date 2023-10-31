# Define a parent class
class Animal:
    def __init__(self, name, species):
        self.name = name
        self._species = species

    def make_sound(self):
        pass

# Define a child class that inherits from Animal
class Dog(Animal):
    def __init__(self, name, breed):
        super().__init__(name, species="Dog")
        self.breed = breed

    def make_sound(self):
        return "Woof!"

class Cat(Animal):
    def __init__(self,name,breed):
        super().__init__(name,species="Cat")
        self.breed = breed


if __name__ == "__main__":
    myDog = Dog("Fido", "Labrador")
    myCat=Cat("Garfield","Persa")

    animales=[myDog,myCat]

    for animal in animales:
        print(animal.name)
        print(animal._species)
        print(animal.make_sound())


        '''
        # Access attributes and methods of the parent and child classes
        print(my_dog.name)      # Output: Fido
        print(my_dog.species)   # Output: Dog
        print(my_dog.breed)     # Output: Labrador
        print(my_dog.make_sound())  # Output: Woof!
        '''