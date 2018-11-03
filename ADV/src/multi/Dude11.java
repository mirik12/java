package multi;

public class Dude11 implements Runnable {
	String name;
	String way = "";
	Dude11 (String name) {
		this.name=name;
	}
	@Override
	public void run () {
		do {
			int step =(int) (Math.random()*4);
			for (int i=0;i<step;i++) {
				way+="|";
				
			}
			System.out.println(name+ " : " +way);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				}while (way.length()<20);
	} 
	}

