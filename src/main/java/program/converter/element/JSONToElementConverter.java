package program.converter.element;

import program.converter.Converter;

/**
 * @author Dominik_Janiga
 */
class JSONToElementConverter implements Converter<String, Element> {

    @Override
    public Element convert(String json) {

        String withoutCharacters = json.replace("{", "")
                                        .replace("}", "")
                                        .replace("\"", "");
        String[] keyAndValue = withoutCharacters.split(":");
        String key = keyAndValue[0].trim();
        String value = keyAndValue[1].trim();
        return new Element(key, value);
    }
}
