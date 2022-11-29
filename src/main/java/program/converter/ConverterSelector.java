package program.converter;

import program.BaseElement;
import program.converter.element.Element;

/**
 * @author Dominik_Janiga
 */
public final class ConverterSelector {

    public static Converter<Element, BaseElement> selectConverter(char beginningTag) {
        return switch (beginningTag) {
            case '<' -> new JSONConverter();
            case '{' -> new XMLConverter();
            default -> throw new NoSuitableConverterFound("No suitable converter found, found beginning tag: "
                                                        + beginningTag + " instead of < or {");
        };
    }
}
