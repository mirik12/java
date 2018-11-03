package some1;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import models.Dog;

@Controller
@RequestMapping("/product")
public class SomeServlet {
	@RequestMapping(method=RequestMethod.POST)
	public String someMethod(ModelMap model) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("app-context.xml");
		Dog dog= (Dog) context.getBean("dogBean");
		model.addAttribute("dog",dog);
		return "product";
		
	}
	@RequestMapping( method=RequestMethod.GET)
	public String anotherMethod(@RequestParam("id")String id, ModelMap model, HttpSession session) {
		model.addAttribute("message", "server responce"+id);
		return "cart";
	}
}
