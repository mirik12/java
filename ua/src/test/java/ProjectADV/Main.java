package ProjectADV;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sun.javafx.scene.control.skin.FXVK.Type;

public class Main {

    public static void main(String[] args) {
        System.out.println("Available number of cores: " + Runtime.getRuntime().availableProcessors());

        Tunnel tunnel = new Tunnel();

        ShipGenerator shipGenerator = new ShipGenerator(tunnel, 10);

        @SuppressWarnings("restriction")
		PierLoader pierLoader1 = new PierLoader(tunnel, Type.EMAIL);
        PierLoader pierLoader2 = new PierLoader(tunnel, Type.NUMERIC);
        PierLoader pierLoader3 = new PierLoader(tunnel, Type.TEXT);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        service.execute(shipGenerator);
        service.execute(pierLoader1);
        service.execute(pierLoader2);
        service.execute(pierLoader3);

        service.shutdown();
   }
}