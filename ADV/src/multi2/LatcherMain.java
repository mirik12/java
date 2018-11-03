package multi2;

import java.util.concurrent.CountDownLatch;

public class LatcherMain {

	public static void main(String[] args) {
		CountDownLatch cl=new CountDownLatch(5);
		new Latcher(cdl);
		System.out.println("CountDownLatch");
		try {
			
			cdl.await();
		}  catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End");
		
	}

}
