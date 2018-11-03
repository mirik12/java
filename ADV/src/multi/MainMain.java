package multi;

public class MainMain {

	public static void main(String[] args) {
		Dude11 d1=new Dude11("A");
		 Thread man1 = new Thread (new Dude11("A"));
		 man1.start();
		 Dude11 d2=new Dude11("B");
		Thread man2=new Thread (new Dude11("B"));
		 man2.start();
	while(man1.isAlive()&&man2.isAlive()) {
		
		
	}
	if (man1.isAlive()) {
		System.out.println(d2.name+ " wins");
	} else {
		System.out.println(d1.name+ " wins");
	}
		/*String name = "Jack";
		String way = "";
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
	}*/
		
	}	
}
