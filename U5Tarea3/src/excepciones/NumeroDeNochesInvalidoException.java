package excepciones;

public class NumeroDeNochesInvalidoException extends RuntimeException {
    public NumeroDeNochesInvalidoException(String message) {
        super(message);
    }

    public NumeroDeNochesInvalidoException() {
        super("Numero de Noches Invalido");
    }

}
