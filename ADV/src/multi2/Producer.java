package multi2;


import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import multi.Store;

public class Producer implements Runnable{
	Semaphore s;
	 String name;
	 Store store;

	public Producer(Store store) {
		this.store = store;
		new Thread(this).start();
	}

	@Override
		
		public void run() {
			System.out.println(name+  "  Started");
			try {
				System.out.println(name+  "  waiting...");
				s.acquire();
				System.out.println(name+  "    got it ");
				for(int i=0;i<20;i++) {
					store.putSomething(i);
					int j = Shared.count++;
					TimeUnit.SECONDS.sleep(1);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+  "  Ended");
			s.release();
	}

}


