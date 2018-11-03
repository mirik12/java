package helloWorld;

public class ConsoleRenderer implements MessageRenderer {

	MessageProvaider provaider;
	
	


	public void setProvaider(MessageProvaider provaider) {
		this.provaider = provaider;
		
	}
	public void render() {
		System.out.println(provaider.getMessage());
	}
	
}
