package uaitea.ua;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Animal")
@XmlType(propOrder= {"age","name"})
public class Cat {

	String name;

	int age;

	public Cat() {
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int div(int a,int b) {
		if(b==0){
			//throw new ArithmeticException();
		}
		return a/b;
	}
	@XmlElement
	public String setName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public int setAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

}

