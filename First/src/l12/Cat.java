package l12;





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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
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
