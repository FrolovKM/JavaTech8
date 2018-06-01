package com.epam.konstantin_frolov.java.lesson8.task1;

import com.epam.konstantin_frolov.java.lesson8.task1.models.*;
import com.epam.konstantin_frolov.java.lesson8.task1.models.Sizes;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Parser {

    public static Something getSomethingByXML(File file, String somethingName) {
        Something something = null;
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(file);
            document.getDocumentElement().normalize();
            NodeList nList = document.getElementsByTagName("something");
            for (int id = 0; id < nList.getLength(); id++) {
                Node nNode = nList.item(id);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nNode;
                    if (getTextElement(element, "name").equals(somethingName)) {
                        int high = Parser.parseElement(element, "high");
                        int wight = Parser.parseElement(element, "wight");
                        int depth = Parser.parseElement(element, "depth");
                        String power = getTextElement(element, "power");
                        String state = getTextElement(element, "state");
                        String nameOfSomething = UtilHelp.getPathToClass(somethingName);
                        Class<?> somethingClass = Class.forName(nameOfSomething);
                        Constructor<?> constructor = somethingClass.getDeclaredConstructor(Sizes.class, String.class, String.class);
                        Sizes size = new Sizes(high, wight, depth);
                        something = (Something) constructor.newInstance(size, power, state);
                    }
                }
            }
        } catch (ParserConfigurationException | IOException | InvocationTargetException |
                NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException |
                IllegalArgumentException | ClassNotFoundException | org.xml.sax.SAXException e) {
            e.printStackTrace();
        }

        return something;
    }

    private static int parseElement(Element element, String tagName) {
        return Integer.parseInt(Parser.getTextElement(element, tagName));
    }

    private static String getTextElement(Element element, String tagName) {
        return element.getElementsByTagName(tagName).item(0).getTextContent();
    }
}
