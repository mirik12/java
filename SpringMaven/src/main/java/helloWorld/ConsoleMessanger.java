package helloWorld;

public class ConsoleMessanger implements MessageProvaider{
	String message = "Hello world!";
	
	public String getMessage() {	
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
