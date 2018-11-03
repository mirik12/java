package less07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class SomeMain {

	public static void main(String[] args) {
		Config config = new Config();
//		config.setAdress("localhost/itea");
//		config.setLogin("root");
//		config.setPassword("");
//		XStream xs= new XStream (new StaxDriver());
//		try {
//			xs.toXML(config, new FileOutputStream("config.xml"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		XStream xs= new XStream (new DomDriver());
		try {
			xs.fromXML(new FileInputStream("config.xml"),config);
			System.out.println(config);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
