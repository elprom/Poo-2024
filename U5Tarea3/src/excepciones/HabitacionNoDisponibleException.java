package excepciones;

public class HabitacionNoDisponibleException extends RuntimeException {
    public HabitacionNoDisponibleException(String message) {
        super(message);
    }

    public HabitacionNoDisponibleException() {
        super("La habitacion ya esta reservada");
    }
}
