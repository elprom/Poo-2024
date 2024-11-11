package habitacion.tipos;

import habitacion.Habitacion;

public class Suite extends Habitacion {

    public Suite(double precioPorNoche, boolean disponible, String tipo) {
        super(150.0, disponible, "Suite");
    }
}
