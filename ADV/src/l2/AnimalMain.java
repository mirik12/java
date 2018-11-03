package l2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AnimalMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat("Barsik",5,"miu-miu");
        System.out.println(cat);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(cat);
        
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream (bais);
        Cat cloneCat = (Cat) ois.readObject();
        
        System.out.println(cloneCat);
        
        
        
    }

}