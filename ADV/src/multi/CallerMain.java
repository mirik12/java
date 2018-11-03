package multi;

public class CallerMain {

	public static void main(String[] args) {
		Callme callme=new Callme();
		new Caller (callme,"first");
		new Caller (callme,"second");
		new Caller (callme,"third");

	}

}
