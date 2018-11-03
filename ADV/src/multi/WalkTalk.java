package multi;

public class WalkTalk {
    public static void main(String[ ] args) {
           
           Dude1 talk = new Dude1();
           Thread walk = new Thread(new Dude2());
          
           talk.start();
           walk.start();
           
    }
}
