package multi;

public class Dude2 implements Runnable {
String name = "Real";
String way = "|";
@Override
public void run() {
      for (int i = 0; i < 20; i++) {
            System.out.println("Real");
            try {
                 Thread.sleep(1000);
            } catch (InterruptedException e) {
                 System.err.println(e);
            }
     }
}
}

