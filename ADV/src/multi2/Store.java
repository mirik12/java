package multi2;

import java.util.concurrent.Semaphore;

public class Store {
	Semaphore s1=new Semaphore(1);
	Semaphore s2=new Semaphore(0);
	volatile int product;
	void putSomething (int n) {
		try {
			s1.acquire();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.product =n;
		System.out.println("PUT  "+n);
		s2.release();
	}
	void getSomething() {
		try {
			s2.acquire();
		}catch (InterruptedException e) {
			e.printStackTrace();
	}
		int temp=product;
		product=0;
		System.out.println("Get:    "+temp);
		s1.release();

}
}

