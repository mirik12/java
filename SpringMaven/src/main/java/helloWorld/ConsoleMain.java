package helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ConsoleMain {

	public static void main(String[] args) {
		ApplicationContext context= new FileSystemXmlApplicationContext("C:\\Users\\ПК\\eclipse-workspace\\SpringMaven\\resources\\app-context2.xml");
		ConsoleRenderer cr=(ConsoleRenderer) context.getBean("consoleRenderer");
		cr.render();
		
	}

}
