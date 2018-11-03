packageDemoData.DemoData;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		// ApplicationContext ctx = new
		// FileSystemXmlApplicationContext("C://DemoData//src//main//resources//mybeans.xml");
		// MyCode mc = (MyCode) ctx.getBean("myCode");
		// mc.doSomething();

		ApplicationContext ctx = new FileSystemXmlApplicationContext("C://DemoData//src//main//resources//mb.xml");
		MyBeanClass mbc = (MyBeanClass) ctx.getBean("myclass");
		System.out.println(mbc);
	}
}
