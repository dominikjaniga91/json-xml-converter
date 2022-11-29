package program.converter;

import program.BaseElement;
import program.XMLElement;
import program.converter.element.Element;

/**
 * @author Dominik_Janiga
 */
class XMLConverter implements Converter<Element, BaseElement> {

    public XMLElement convert(Element element) {
        return new XMLElement(element);
    }
}
