package ua.itea;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pudgeservice")
public class PudgeController {

	@RequestMapping(value="/{name}")
	@ResponseBody
	public Pudge getPudge(@PathVariable String name) {
		Pudge pudge=new Pudge();
		pudge.setName(name);
		pudge.setLevel(13);
		return pudge;
		
	}
	@RequestMapping(value="/{id}", method=RequestMethod.POST)
	@ResponseBody
	public Pudge getPudgePOST(@PathVariable String id) {
		Pudge pudge=new Pudge();
		pudge.setName("POST Pudge");
		pudge.setLevel(0);
		return pudge;
		
	}
	
}
