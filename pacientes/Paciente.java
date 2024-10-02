package pacientes;

public class Paciente {
    // Atributos
    public int id;
    public String nombre;
    public String apellidos;
    public String fechaNacimiento;
    public String tipoSangre;
    public String sexo;
    private String telefono;

    // Constructor
    public Paciente(String apellidos, String fechaNacimiento, int id, String nombre, String sexo, String telefono, String tipoSangre) {
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.telefono = telefono;
        this.tipoSangre = tipoSangre;
    }

    // Mostrar
    public String mostrarPaciente() {
        String datos = String.format(
                "Id: %d, Nombre: %d, Fecha Nacimiento: %d, Tipo Sangre: %d, Sexo: %d, Telefono: %d",
                id, nombre, fechaNacimiento, tipoSangre, sexo, telefono
        );
        return datos;
    }


} // Fin Paciente

