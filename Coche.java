
public class Coche {

    private String marca;
    private String modelo;
    private int año;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }

    public int calcularEdadDelCoche(int añoActual) {
        return añoActual - año;
    }


    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", 2015);
        Coche coche2 = new Coche("Ford", "Mustang", 2018);
        Coche coche3 = new Coche("Honda", "Civic", 2020);

        int añoActual = 2024;


        System.out.println("Información del coche 1:");
        coche1.mostrarInformacion();
        System.out.println("Edad del coche 1: " + coche1.calcularEdadDelCoche(añoActual) + " años");

        System.out.println("\nInformación del coche 2:");
        coche2.mostrarInformacion();
        System.out.println("Edad del coche 2: " + coche2.calcularEdadDelCoche(añoActual) + " años");

        System.out.println("\nInformación del coche 3:");
        coche3.mostrarInformacion();
        System.out.println("Edad del coche 3: " + coche3.calcularEdadDelCoche(añoActual) + " años");
    }
}

