package multi2;

import java.util.concurrent.CyclicBarrier;

public class MainMan {

	public static void main(String[] args) {
		CyclicBarrier cb=new CyclicBarrier(3,new Bus());
		new Man ("A",cb,3);
		new Man ("b",cb,4);
		new Man ("c",cb,2);
		new Man ("d",cb,5);
		new Man ("e",cb,6);
		new Man ("e",cb,7);

	}

}
