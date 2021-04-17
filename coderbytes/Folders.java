package coderbytes;

import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
    	//read XML from the given string
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder builder = factory.newDocumentBuilder();
    	InputSource is = new InputSource(new StringReader(xml));
    	Document doc = builder.parse(is);
    	org.w3c.dom.Node check = doc.getFirstChild();
    	System.out.println(check.toString());
    	System.out.println(check.getNodeValue());
    	org.w3c.dom.Node check1 = doc.getNextSibling();
    	System.out.println(check1.toString());
    	System.out.println(check1.getNodeValue());

    	Collection<String> names = new ArrayList<String>();
    	names.add("message");
		return names;    
    }
    
    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<folder name=\"c\">" +
                    "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                    "</folder>" +
                    "<folder name=\"users\" />" +
                "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for(String name: names)
            System.out.println(name);
    }
}