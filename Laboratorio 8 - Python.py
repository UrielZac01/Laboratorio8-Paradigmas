import math

# Clase base Figura
class Figura:
    def __init__(self, color):
        self.color = color

    def get_color(self):
        return self.color

    def perimetro(self):
        return 0.0  # Implementacion generica para el perimetro

    def area(self):
        return 0.0  # Implementacion generica para el area

# Clase Triangulo
class Triangulo(Figura):
    def __init__(self, color, lado1, lado2, lado3):
        super().__init__(color)
        self.lado1 = lado1
        self.lado2 = lado2
        self.lado3 = lado3

    def perimetro(self):
        return self.lado1 + self.lado2 + self.lado3

    def area(self):
        # Implementa el calculo de area especifico para un triangulo
        s = self.perimetro() / 2
        return math.sqrt(s * (s - self.lado1) * (s - self.lado2) * (s - self.lado3))

# Clase Circulo
class Circulo(Figura):
    def __init__(self, color, radio):
        super().__init__(color)
        self.radio = radio

    def perimetro(self):
        return 2 * math.pi * self.radio

    def area(self):
        return math.pi * self.radio * self.radio

# Clase Rectangulo
class Rectangulo(Figura):
    def __init__(self, color, base, altura):
        super().__init__(color)
        self.base = base
        self.altura = altura

    def perimetro(self):
        return 2 * (self.base + self.altura)

    def area(self):
        return self.base * self.altura

# Clase Hexagono
class Hexagono(Figura):
    def __init__(self, color, lado):
        super().__init__(color)
        self.lado = lado

    def perimetro(self):
        return 6 * self.lado

    def area(self):
        return (3 * math.sqrt(3) * self.lado * self.lado) / 2

# Ejemplo de uso
figuras = [Triangulo("Rojo", 3, 4, 5), Circulo("Azul", 2.5), Rectangulo("Verde", 4, 6), Hexagono("Amarillo", 3)]

for figura in figuras:
    print("Figura de color", figura.get_color())
    print("Perimetro:", figura.perimetro())
    print("Area:", figura.area())