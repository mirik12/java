package multi2;

public class Main {

	public static void main(String[] args) {
		DemoThread t=new DemoThread();
		try {
			Thread.sleep (5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.pause();
		try {
			Thread.sleep (5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.resume();

	}

}
