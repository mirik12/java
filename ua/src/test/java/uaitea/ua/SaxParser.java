package uaitea.ua;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SaxParser {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory f=SAXParserFactory.newInstance();
		SAXParser parser=f.newSAXParser();
		MyParser handler=new MyParser();
	    parser.parse(new File("new3.xml"), handler);
	}

}
