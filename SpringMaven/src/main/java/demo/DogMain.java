package demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DogMain {

	public static void main(String[] args) {
		
		try {
			//ApplicationContext context= new ClassPathXmlApplicationContext("C:\\Users\\app-context.xml");
			ApplicationContext context= new FileSystemXmlApplicationContext("C:\\Users\\ПК\\eclipse-workspace\\SpringMaven\\resources\\app-context.xml");
		Dog dog=(Dog) context.getBean("dogBean");
		//Owner owner=(Owner) context.getBean("ownerBean");
		
		System.out.println(dog);
		//System.out.println(owner);
		} catch (BeansException e) {
			e.printStackTrace();
		}
}
}
