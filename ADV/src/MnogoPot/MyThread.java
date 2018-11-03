package MnogoPot;

public class MyThread implements Runnable {
GUI gui;

MyThread(GUI gui){
	new Thread(this).start();
	this.gui = gui;
}
	@Override
	public void run() {
		double temp = 0;
		for(int i = 0;i < 2147483647;i++) {
			temp = i / 2147483646.0  * 100.0;
			gui.setPercent((int)temp);
			
		}
	}
}
	
