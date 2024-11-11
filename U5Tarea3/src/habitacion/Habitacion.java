package habitacion;

import excepciones.HabitacionNoDisponibleException;

public abstract class Habitacion {
    public double precioPorNoche;
    public boolean disponible;
    public String tipo;

    public Habitacion(double precioPorNoche, boolean disponible, String tipo) {
        this.precioPorNoche = precioPorNoche;
        this.disponible = disponible;
        this.tipo = tipo;
    }

    public void reservar(int noches) {
        System.out.println();
        if (disponible) {
            disponible = false;
            System.out.println("Habitacion reservada con éxito!");
        } else {
            throw new HabitacionNoDisponibleException();
        }
        // Verificar num noches
        if (noches <= 0) {
            throw new HabitacionNoDisponibleException();
        } else {
            disponible = false;
            System.out.println("Habitacion reservada con éxito!");
        }
    }

    public void liberar() {
        System.out.println();
        if (!disponible) {
            disponible = true;
            System.out.println("Habitacion liberada con éxito!");
        } else {
            System.out.println("Habitación no reservada");
        }
    }

    public void mostrarDetalles(){



        System.out.println("* " + tipo);
        System.out.println("Precio: " + precioPorNoche);
        if (disponible == true) {
            System.out.println("Disponibilidad: Disponible");
        } else {
            System.out.println("Disponibilidad: Reservada");
        }
    }


}
