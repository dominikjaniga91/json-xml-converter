package program;


import program.converter.element.Element;

/**
 * @author Dominik_Janiga
 */
public record JSONElement(Element element) implements BaseElement {

    private final static String OPENING_BRACKET = "{";
    private final static String CLOSING_BRACKET = "}";
    private final static String KEY_VALUE_SEPARATOR = ":";
    private final static String QUOTE = "\"";

    @Override
    public String toString() {
        String key = QUOTE + element.key() + QUOTE;
        String elementValue = element.value();
        String value = elementValue == null ? null : QUOTE + element.value() + QUOTE;
        String body = key + KEY_VALUE_SEPARATOR + value;
        return OPENING_BRACKET + body + CLOSING_BRACKET;
    }
}
