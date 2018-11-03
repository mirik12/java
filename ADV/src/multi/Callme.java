package multi;

import java.util.concurrent.TimeUnit;

public class Callme {
Callme () {
	
}
//synchronized
void getString(String msg) {
	//free=false;
	System.out.println("[" +msg);
	try {
		TimeUnit.SECONDS.sleep(1);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("j");
}
 }
