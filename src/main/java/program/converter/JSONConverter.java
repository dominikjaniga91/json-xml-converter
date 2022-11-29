package program.converter;

import program.BaseElement;
import program.JSONElement;
import program.converter.element.Element;

/**
 * @author Dominik_Janiga
 */
class JSONConverter implements Converter<Element, BaseElement> {

    @Override
    public JSONElement convert(Element element) {
        return new JSONElement(element);
    }
}
