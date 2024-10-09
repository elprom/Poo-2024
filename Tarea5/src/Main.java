public class Rectangulo {
    private double ancho;
    private double alto;

    // Constructor que acepta dos doubles
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Constructor que acepta dos enteros
    public Rectangulo(int ancho, int alto) {
        this.ancho = (double) ancho;
        this.alto = (double) alto;
    }

    // Método para calcular el área con parámetros doubles
    public double calcularArea(double ancho, double alto) {
        return ancho * alto;
    }

    // Método para calcular el área con parámetros enteros
    public double calcularArea(int ancho, int alto) {
        return calcularArea((double) ancho, (double) alto);
    }

    // Método para calcular el perímetro con parámetros doubles
    public double calcularPerimetro(double ancho, double alto) {
        return 2 * (ancho + alto);
    }

    // Método para calcular el perímetro con parámetros enteros
    public double calcularPerimetro(int ancho, int alto) {
        return calcularPerimetro((double) ancho, (double) alto);
    }

    // Getters y setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}
public class Empleado {

    // Método para calcular el salario con solo sueldo base
    public double calcularSalario(double sueldoBase) {
        return sueldoBase;
    }

    // Método para calcular el salario con sueldo base y bonificación
    public double calcularSalario(double sueldoBase, double bonificacion) {
        return sueldoBase + bonificacion;
    }

    public double calcularSalario(double sueldoBase, double bonificacion, int horasExtras) {
        return sueldoBase + bonificacion + (horasExtras * 20);
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo(10.5, 20.0);
        Rectangulo rect2 = new Rectangulo(10, 20);

        System.out.println("Área del rectángulo (doubles): " + rect1.calcularArea(10.5, 20.0));
        System.out.println("Área del rectángulo (enteros): " + rect2.calcularArea(10, 20));

        System.out.println("Perímetro del rectángulo (doubles): " + rect1.calcularPerimetro(10.5, 20.0));
        System.out.println("Perímetro del rectángulo (enteros): " + rect2.calcularPerimetro(10, 20));

        Empleado empleado = new Empleado();

        System.out.println("Salario con solo sueldo base: " + empleado.calcularSalario(3000.0));
        System.out.println("Salario con sueldo base y bonificación: " + empleado.calcularSalario(3000.0, 500.0));
        System.out.println("Salario con sueldo base, bonificación y horas extras: " + empleado.calcularSalario(3000.0, 500.0, 10));
    }
}
