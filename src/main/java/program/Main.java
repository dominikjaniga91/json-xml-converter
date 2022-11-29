package program;

import program.converter.Converter;
import program.converter.ConverterSelector;
import program.converter.element.Element;
import program.converter.element.ElementConverterSelector;

import java.util.Scanner;

/**
 * @author Dominik_Janiga
 */
class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        char beginningTag = userInput.charAt(0);
        Converter<String, Element> elementConverter = ElementConverterSelector.selectConverter(beginningTag);
        Element element = elementConverter.convert(userInput);
        Converter<Element, BaseElement> converter = ConverterSelector.selectConverter(beginningTag);
        BaseElement convertedTag = converter.convert(element);
        System.out.println(convertedTag);
    }
}
