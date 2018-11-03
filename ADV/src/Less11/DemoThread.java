package Less11;

import java.util.concurrent.CountDownLatch;

public class DemoThread implements Runnable {
String name;
CountDownLatch cd;


	public DemoThread(String name, CountDownLatch cd) {
	
	this.name = name;
	this.cd = cd;
}


	@Override
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println();
			cd.countDown();
		}
		
	}

}
