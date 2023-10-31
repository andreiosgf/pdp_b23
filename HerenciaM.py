class Animal:
    def __init__(self, name):
        self.name = name

    def eat(self):
        print(f"{self.name} is eating.")

class Flyer:
    def __init__(self, wingspan):
        self.wingspan = wingspan

    def fly(self):
        print(f"Flying with a wingspan of {self.wingspan}.")

class Swimmer:
    def __init__(self, length):
        self.length = length

    def swim(self):
        print(f"Swimming with a length of {self.length}.")

class Bat(Animal, Flyer):
    def __init__(self, name, wingspan):
        Animal.__init__(self, name)
        Flyer.__init__(self, wingspan)

    def speak(self):
        print("Screech!")

class Whale(Animal, Swimmer):
    def __init__(self, name, length):
        Animal.__init__(self, name)
        Swimmer.__init__(self, length)

    def speak(self):
        print("Whale sound!")

bat = Bat("Batty", 12)
bat.eat()
bat.fly()
bat.speak()

whale = Whale("Willy", 15)
whale.eat()
whale.swim()
whale.speak()
