class Person:
    __name=None
    __age=None
    def __init__(self, name, age):
        self.__name = name
        self.__age = age

    def __str__(self):
        return f'{__name} and {__age}'

if __name__=='__main__':
    people = [
        Person("Alice", 25),
        Person("Bob", 30),
        Person("Charlie", 35)
    ]

    for obj in people:
        print(obj)
