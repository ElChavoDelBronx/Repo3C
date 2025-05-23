class Triangulo {
    double lado, altura;

    public Triangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double area() {
        return (lado * altura) / 2;
    }

    public double perimetro() {
        return lado * 3;
    }
}

class Cuadrado {
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return lado * 4;
    }
}

class Circulo {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}

public class AreaPerimetros {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(6, 5);
        Cuadrado c = new Cuadrado(4);
        Circulo cir = new Circulo(3);

        System.out.println("Triángulo:");
        System.out.println("Área: " + t.area());
        System.out.println("Perímetro: " + t.perimetro());
        
        System.out.println("\nCuadrado:");
        System.out.println("Área: " + c.area());
        System.out.println("Perímetro: " + c.perimetro());
        
        System.out.println("\nCírculo:");
        System.out.println("Área: " + cir.area());
        System.out.println("Perímetro: " + cir.perimetro());
    }
}
