package l3;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {

	public static void main(String[] args) {

        String host = (args.length < 1) ? null : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            MyRemote stub = (MyRemote) registry.lookup("Hello");
            String response = stub.getMessage();
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }

	}


