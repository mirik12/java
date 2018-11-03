package multi2;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class Man implements Runnable  {
	String name;
	CyclicBarrier cb;
	public Man(String name, CyclicBarrier cb, int sleepTime) {
		super();
		this.name = name;
		this.cb = cb;
		SleepTime = sleepTime;
		TimeUnit.SECONDS.sleep(this.sleepTime);
		try {
			TimeUnit.SECONDS.sleep(this.sleepTime);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
	} 


	int SleepTime;
	
	
@Override
public void run () {
	System.out.println(name+ "starting go");
	try {
		TimeUnit.SECONDS.sleep(sleepTime);
	}catch (InterruptedException e) {
		e.printStackTrace();
	try {
		cb.await();
	}catch (InterruptedException e) {
		e.printStackTrace();
}catch (BrokenBarrier e) {
	e.printStackTrace()
	
}
}
