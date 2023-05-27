package lectorxml;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LectorXML {

    public static void main(String[] args) {

        try {
            //Se crea el documento en memoria y se lee desde el archivo.
            DocumentBuilderFactory d = DocumentBuilderFactory.newInstance();
            DocumentBuilder doc = d.newDocumentBuilder();
            Document documento = doc.parse(new File("tirori.xml"));

            Element elemento_raiz = documento.getDocumentElement();
            System.out.println("Leyendo etiqueta '" + elemento_raiz.getTagName() + "'.");

            NodeList nodos = elemento_raiz.getElementsByTagName("mensaje");

            for (int i = 0; i < nodos.getLength(); i++) {
                Node n = nodos.item(i);
                System.out.println("\t-> " + n.getTextContent());
            }

            System.out.println("Se terminó de leer la etiqueta '" + elemento_raiz.getTagName() + "'.");

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(LectorXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LectorXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(LectorXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}