package uaitea.ua;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class CatParser {
	public Object getObject(File file, Class c) throws JAXBException {
		JAXBContext context=JAXBContext.newInstance(c));
		Unmarshaller unmarshaller=context.createMarshaller();
		Object obj=unmarshaller.unmarshal(file);
		return obj;
	}
	
	
public void saveObject(File file, Object o) throws JAXBException {
	JAXBContext context=JAXBContext.newInstance(o.getClass());
	Marshaller marshaller=context.createMarshaller();
	marshaller.marshal(o,file);
}
}
