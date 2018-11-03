package multi2;

import java.util.concurrent.Semaphore;

public class SM {

	public static void main(String[] args) {
	Semaphore s=new Semaphore(1);
	new Worker(s,"A");
	new Worker(s,"B");
	new Worker(s,"C");

	}

}
