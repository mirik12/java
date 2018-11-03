package multi;

public class Dude1 extends Thread {
 String name = "Liver";
 String way = "|";
 public void run() {
     for (int i = 0; i < 20; i++) {
     System.out.println("Liver");
       try {
          Thread.sleep(1000); 
     } catch (InterruptedException e) {
     System.err.print(e);
   }
  }
 }
}

