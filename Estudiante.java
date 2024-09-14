import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String idEstudiante;
    private List<Curso> cursos;

    public Estudiante(String nombre, String idEstudiante) {
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del Estudiante: " + nombre);
        System.out.println("ID del Estudiante: " + idEstudiante);
        System.out.println("Cursos Inscritos:");
        for (Curso curso : cursos) {
            curso.mostrarInfoCurso();
            System.out.println();
        }
    }
}
