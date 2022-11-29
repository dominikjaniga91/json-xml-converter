package program.converter;

/**
 * @author Dominik_Janiga
 */
public class NoSuitableConverterFound extends RuntimeException {

    public NoSuitableConverterFound(String message) {
        super(message);
    }
}
