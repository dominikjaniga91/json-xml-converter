package program.converter.element;

import program.converter.Converter;
import program.converter.NoSuitableConverterFound;

/**
 * @author Dominik_Janiga
 */
public final class ElementConverterSelector {

    public static Converter<String, Element> selectConverter(char beginningTag) {
        return switch (beginningTag) {
            case '<' -> new XMLToElementConverter();
            case '{' -> new JSONToElementConverter();
            default -> throw new NoSuitableConverterFound("No suitable converter found, found beginning tag: "
                    + beginningTag + " instead of < or {");
        };
    }
}
