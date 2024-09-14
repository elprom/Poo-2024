public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Matemáticas", "MAT101", "Dr. Pérez");
        Curso curso2 = new Curso("Historia", "HIS202", "Sra. Gómez");
        Curso curso3 = new Curso("Programación", "PRO303", "Ing. López");

        Estudiante estudiante1 = new Estudiante("Juan Pérez", "E12345");
        Estudiante estudiante2 = new Estudiante("Ana Fernández", "E67890");

        estudiante1.agregarCurso(curso1);
        estudiante1.agregarCurso(curso3);

        estudiante2.agregarCurso(curso2);
        estudiante2.agregarCurso(curso3);

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
    }
}
