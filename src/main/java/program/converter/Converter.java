package program.converter;

/**
 * @author Dominik_Janiga
 */
public interface Converter<T, R> {

    R convert(T t);
}
