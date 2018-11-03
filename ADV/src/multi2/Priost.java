package multi2;

import java.time.*;
import java.util.concurrent.locks.*;

class Priost
{
    static Lock lock = new ReentrantLock();

    public static void main (String[] args) throws java.lang.Exception
    {
        Thread worker = new Thread(() -> {
                try {
                    for (int i = 0; i < 20; i++) {
                        Thread.sleep(200);
                        
                        lock.lock();
                        lock.unlock();
                        System.out.println(LocalTime.now());
                    }
                } catch (InterruptedException ex) { }
            });
        worker.start();
        Thread.sleep(1000);
        System.out.println("Locking...");
        lock.lock();
        
        Thread.sleep(5000);
        lock.unlock();
        
        System.out.println("Unlocked");
        worker.join();
    }
}