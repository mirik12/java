package Less11;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DogMain {

	public static void main(String[] args) {
		ExecutorService ex=Executors.newFixedThreadPool(3);
		Future<String> f1;
		Future<String> f2;
		Future<String> f3;
		System.out.println("Start");
f1=ex.submit(new Dog("A",3));
f2=ex.submit(new Dog("B",4));
f3=ex.submit(new Dog("C",5));

try {
	System.out.println(f1.get());
	System.out.println(f2.get());
	System.out.println(f3.get());
} catch (InterruptedException | ExecutionException e) {
	e.printStackTrace();
}
ex.shutdown();
	}

}
