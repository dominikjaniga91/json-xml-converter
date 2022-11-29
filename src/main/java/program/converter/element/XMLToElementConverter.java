package program.converter.element;

import program.converter.Converter;

/**
 * @author Dominik_Janiga
 */
class XMLToElementConverter implements Converter<String, Element> {

    @Override
    public Element convert(String xml) {

        int leftAngleBracketIndex = xml.indexOf("<");
        int rightAngleBracketIndex = xml.indexOf(">");

        if (xml.endsWith("/>")) {
            int noBodyClosingBracket = xml.indexOf("/>");
            String key = xml.substring(leftAngleBracketIndex + 1, noBodyClosingBracket);
            return new Element(key, null);
        } else {
            String key = xml.substring(leftAngleBracketIndex + 1, rightAngleBracketIndex);
            int closingLeftBracketIndex = xml.indexOf("</");
            String value = xml.substring(rightAngleBracketIndex + 1, closingLeftBracketIndex);
            return new Element(key, value);
        }

    }
}
