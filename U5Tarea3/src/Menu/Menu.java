package menu;

import habitacion.Habitacion;

import java.util.Scanner;

public class Menu {



    public int SolicitarOpcion() {
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        System.out.println("""
                    --- Sistema de Reservas de Habitaciones ---
                    1. Mostrar detalles de las habitaciones
                    2. Realizar una reserva
                    3. Liberar una habitación
                    4. Salir
                """);

        System.out.print("Seleccione una opcion: ");

        try {
            opcion = input.nextInt();
            return opcion;
        } catch (Exception e) {
            System.out.println("Intente de nuevo!");
            SolicitarOpcion();
        }


        return opcion;

    }


    public int SolicitarHabitacion() {
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        System.out.println("""
                    1. Individual
                    2. Doble
                    3. Suite
                """);

        System.out.print("Seleccione el tipo de habitacion: ");

        try {
            opcion = input.nextInt();
        } catch (Exception e) {
            System.out.println("Intente de nuevo!");
            SolicitarOpcion();
        }

        return opcion;
    }

    public int SolicitarNumNoches() {
        Scanner input = new Scanner(System.in);
        int numNoches = 0;

        do {
            System.out.print("Seleccione el número de noches: ");

            try {
                numNoches = input.nextInt();
            } catch (Exception e) {
                System.out.println("Intente de nuevo!");
                SolicitarOpcion();
            }
        } while (numNoches <= 0);

        return numNoches;
    }

}
