package multi;

public class Store {
	volatile int product;
	
	public synchronized void putSomething(int n) {
		while (product > 1) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.product = n;
		notify();
	}

	public synchronized int getSomething() {
	    
		while (product < 1) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		int temp = product;
		
		product = 0;
		notify();
		return temp;

	}

}
