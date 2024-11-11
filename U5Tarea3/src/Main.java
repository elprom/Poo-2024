import excepciones.HabitacionNoDisponibleException;
import excepciones.NumeroDeNochesInvalidoException;
import habitacion.tipos.Doble;
import habitacion.tipos.Individual;
import habitacion.tipos.Suite;
import menu.Menu;

public class Main {
    public static void main(String[] args) {

        Individual individual = new Individual(50, true, "Individual");
        Doble doble = new Doble(75, true, "Doble");
        Suite suite = new Suite(150, true, "Suite");

        do {
            Menu menu = new Menu();
            int habitacion;
            int opcion = menu.SolicitarOpcion();

            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("---Mostrar detalles de las habitaciones---");
                    individual.mostrarDetalles();
                    doble.mostrarDetalles();
                    suite.mostrarDetalles();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("---Realizar una reserva---");
                    habitacion = menu.SolicitarHabitacion();
                    int numNoches = menu.SolicitarNumNoches();
                    switch (habitacion) {
                        case 1:
                            try {
                                individual.reservar(numNoches);
                            } catch(HabitacionNoDisponibleException e) {
                                System.out.println("Error" + e.getMessage());
                            } catch(NumeroDeNochesInvalidoException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            break;
                        case 2:
                            try {
                                doble.reservar(numNoches);
                            } catch(HabitacionNoDisponibleException e) {
                                System.out.println("Error" + e.getMessage());
                            } catch(NumeroDeNochesInvalidoException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            break;
                        case 3:
                            try {
                                suite.reservar(numNoches);
                            } catch(HabitacionNoDisponibleException e) {
                                System.out.println("Error: " + e.getMessage());
                            } catch(NumeroDeNochesInvalidoException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            break;
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("---Liberar una habitacion---");
                    habitacion = menu.SolicitarHabitacion();
                    switch (habitacion) {
                        case 1:
                            individual.liberar();
                            break;
                        case 2:
                            doble.liberar();
                            break;
                        case 3:
                            suite.liberar();
                            break;
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("---Salir---");
                    return;

            }
        }
        while (true);



    }
}