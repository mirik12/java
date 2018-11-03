package multi2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Worker implements Runnable {
Semaphore s;
String name;

public Worker(Semaphore s, String name) {

	
	this.s = s;
	this.name = name;
	new Thread().start();
}
@Override
public void run() {
	System.out.println(name+  "  Started");
	try {
		System.out.println(name+  "  waiting...");
		s.acquire();
		System.out.println(name+  "    got it ");
		for(int i=0;i<5;i++) {
			Shared.count++;
			TimeUnit.SECONDS.sleep(1);
		}
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(name+  "  Ended");
	s.release();
}
}
