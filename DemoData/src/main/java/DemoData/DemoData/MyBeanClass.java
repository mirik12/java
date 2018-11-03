package DemoData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("myclass")
public class MyBeanClass {
	private String name = "I am AnnoBean";
	@Autowired
	private InjectedBean injectedBean;

	public InjectedBean getInjectedBean() {
		return injectedBean;
	}

	public void setInjectedBean(InjectedBean injectedBean) {
		this.injectedBean = injectedBean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyBeanClass [name=" + name + ", injectedBean=" + injectedBean + "]";
	}

}
