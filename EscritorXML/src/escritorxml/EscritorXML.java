package escritorxml;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class EscritorXML {

    public static void main(String[] args) {
        try {
            // Se crea el documento.
            DocumentBuilderFactory d = DocumentBuilderFactory.newInstance();
            DocumentBuilder doc = d.newDocumentBuilder();
            Document documento = doc.newDocument();

            // Se crea el elemento raíz del documento.
            Element raiz = documento.createElement("raiz");
            documento.appendChild(raiz);

            // Se crea el elemento 'mensaje' del elemento raíz.
            Element mensaje = documento.createElement("mensaje");
            raiz.appendChild(mensaje);

            Node texto = documento.createTextNode("Me pica el cimbrelo.");
            mensaje.appendChild(texto);

            DOMSource origen = new DOMSource(documento);
            TransformerFactory t = TransformerFactory.newInstance();
            Transformer trans = t.newTransformer();
            StreamResult archivo = new StreamResult(new File("tirori.xml"));

            trans.transform(origen, archivo);

        } catch (TransformerException ex) {
            Logger.getLogger(EscritorXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(EscritorXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}