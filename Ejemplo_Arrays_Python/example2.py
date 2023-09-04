import random
lista=[]

for i in range(0,5):
    lista.append(random.randint(1,20))

print(lista)
print(f'La suma de la lista es {sum(lista)}')