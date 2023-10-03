class Persona:
    nombre=None
    edad=None
    domicilio=None

    def __init__(self,n,e,d):
        self.nombre=n
        self.edad=e
        self.domicilio=d

    def get_nombre(self):
        return self.nombre

    def get_edad(self):
        return self.edad

    def get_domicilio(self):
        return self.domicilio

    def __str__(self):
        return f'Nombre {self.nombre} edad {self.edad} domicilio {self.domicilio}'