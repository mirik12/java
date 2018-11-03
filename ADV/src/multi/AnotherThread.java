package multi;

public class AnotherThread implements Runnable {
	AnotherThread () {
		new Thread (this).start ();
		
	}
 public void run () {
	 System.out.println("Hi");
 }
}
