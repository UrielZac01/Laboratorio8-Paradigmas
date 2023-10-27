// Clase base Figura
class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double perimetro() {
        return 0.0;  // Implementacion generica para perimetro
    }

    public double area() {
        return 0.0;  // Implementacion generica para area
    }
}

// Clase Triangulo
class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(String color, double lado1, double lado2, double lado3) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double area() {
        // Implementa el calculo de area especifico para un triangulo
        double s = perimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}

// Clase Circulo
class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}

// Clase Rectangulo
class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public double area() {
        return base * altura;
    }
}

// Clase Hexagono
class Hexagono extends Figura {
    private double lado;

    public Hexagono(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 6 * lado;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[4];
        figuras[0] = new Triangulo("Rojo", 3, 4, 5);
        figuras[1] = new Circulo("Azul", 2.5);
        figuras[2] = new Rectangulo("Verde", 4, 6);
        figuras[3] = new Hexagono("Amarillo", 3);

        for (Figura figura : figuras) {
            System.out.println("Figura de color " + figura.getColor());
            System.out.println("Perimetro: " + figura.perimetro());
            System.out.println("Area: " + figura.area());
            System.out.println();
        }
    }
}
