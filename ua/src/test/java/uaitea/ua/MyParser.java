package uaitea.ua;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyParser extends DefaultHandler  {
@Override
public void startDocument()
        throws SAXException {
	System.out.println("I found start");
}
@Override
public void startElement(String uri,String localName,String qName,
        Attributes attributes)
          throws SAXException {
	System.out.println("found node" +qName);
	for(int i=0;i<attributes.getLength();i++) {
		System.out.println("Attributes"+attributes.getQName(i)+" = " + attributes.getValue(i));
	}
}
@Override
public void characters(char[] ch, int start,int length) throws SAXException {
	String v="";
	for (int i=start;i<length;i++) {
		v+=ch[i];
		
	}
	if (v.length()>0) {
		System.out.println("Value:" +v.trim());
	}
}
@Override
public void endDocument() throws SAXException {
	System.out.println("i found end");
}


}
