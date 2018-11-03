package l3;

public class MyTM {

	public static void main(String[] args) {
		//MyT t=new MyT();
		Runnable t=new Runnable () {
			
			@Override
			public void run () {
				System.out.println ("Hello");
				
			}};
			Thread thread = new Thread (()->System.out.println ("Hello"));
			thread.start ();
			System.out.println (Thread.activeCount ());
			
			
		}

	}


