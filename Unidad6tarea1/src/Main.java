import menu.Menu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        // Crear archivo
        try {
            File archivo = new File("archivo.txt");
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("Archivo creado con anterioridad");
            }

            while (true) {
                System.out.println("Administrador tareas");
                int opcion = menu.opcion();

                switch (opcion) {
                    case 1:
                        // Escribir tarea
                        String tarea = menu.IngresarTarea();
                        FileWriter archivoWriter = new FileWriter(archivo);
                        archivoWriter.write(tarea);
                        archivoWriter.close();
                        break;
                    case 2:
                        // Leer tareas
                        try (Scanner scanner = new Scanner(new File("archivo.txt"))) {
                            while (scanner.hasNextLine()) {
                                String linea = scanner.nextLine();
                                System.out.println(linea);
                            }
                        } catch (IOException e) {
                            System.out.println("Ocurrió un error al leer el archivo.");
                        }
                        break;
                    case 3:
                        // Cerrar programa
                        System.out.println("Programa finalizado");
                        break;


                }
            }

        } catch (IOException e) {
            System.out.println("A ocurrido un error");
        }

    }}