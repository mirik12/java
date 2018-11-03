package multi;

public class MainThread extends Thread {

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println(Thread.activeCount());
		//NewThread thread=new NewThread();
		//thread.start();
		// thread.run();
		System.out.println(Thread.activeCount());
		Shared shared=new Shared ();
		//new Thread1(shared);
		//new Thread2(shared);
		new AnotherThread();
		System.out.println("End");
		

	}

}
