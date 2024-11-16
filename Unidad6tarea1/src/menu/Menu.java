package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner Entrada = new Scanner(System.in);
    public int opcion(){

        int opcion = 0;

        while (true){
            System.out.println("""
                    1. Escribir Tarea
                    2. Leer Tareas
                    3. Salir
                    """);
            System.out.println("Seleccione una opcion: ");

            try {
                opcion = Entrada.nextInt();
            }catch (InputMismatchException e){
                System.out.println(" Valor introducido No Valido :(");
            continue;
            }

            if (opcion >= 1 && opcion <= 3){
                break;
            }else {
                System.out.println(" Seleccione un valor dentro del Rango ;)");
            }
        }
        return opcion;
    }

    public String IngresarTarea(){
        //Hola Guapo
        String tarea;

        System.out.println("Ingrese una tarea: ");
        tarea = Entrada.nextLine();

        System.out.println("Se Guardo la Tarea :)");
        return tarea;
    }
}
