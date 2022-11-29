package program;


import program.converter.element.Element;

/**
 * @author Dominik_Janiga
 */
public record XMLElement(Element element) implements BaseElement {

    private final static String LEFT_ANGLE_BRACKET = "<";
    private final static String RIGHT_ANGLE_BRACKET = ">";
    private final static String LEFT_CLOSING_ANGLE_BRACKET = "</";
    private final static String CLOSING_NO_BODY_BRACKET = "/>";

    @Override
    public String toString() {
        String value = this.element.value();
        String key = element.key();
        if ("null".equals(value)) {
            return LEFT_ANGLE_BRACKET + key + CLOSING_NO_BODY_BRACKET;
        } else {
            String openingTag = LEFT_ANGLE_BRACKET + key + RIGHT_ANGLE_BRACKET;
            String closingTag = LEFT_CLOSING_ANGLE_BRACKET + element.key() + RIGHT_ANGLE_BRACKET;
            return openingTag + value + closingTag;
        }
    }
}
