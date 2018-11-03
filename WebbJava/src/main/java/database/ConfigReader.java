package database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ConfigReader {
	File file = new File("config.xml");

	
	public Config getConfig() {
		Config config = new Config();
		XStream xs = new XStream(new DomDriver());
		
		try {
		
			xs.fromXML(new FileInputStream(file.getPath()),config);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return config;
	}
	
	public String getFile() {
		return file.getAbsolutePath();
	}
}
