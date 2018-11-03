package multi;

public class NewThread extends Thread {
	NewThread() {
		//run();
		start();
	}
@Override
public void run () {
	System.out.println("Hello");
}
}
