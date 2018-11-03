package l2;

import java.io.*;

public class SerO {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
    Dog dog = new Dog("Bobik",2);
    Owner owner = new Owner("Zeus");
    dog.setOwner(owner);
    
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dog.ser"));
    oos.writeObject(dog);
    oos.close();
    
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dog.ser"));
    Dog clone = (Dog) ois.readObject();
    owner.setName("Pudge");
    System.out.println(dog);
    System.out.println(clone);
    ois.close();
    
    //клон собаки через сериализацию
//    Dog clone = null;
//    ByteArrayOutputStream baos = new ByteArrayOutputStream();
//    try {
//    ObjectOutputStream oos = new ObjectOutputStream(baos);
//    oos.writeObject(dog);
//    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//        ObjectInputStream ois = new ObjectInputStream(bais);
//            clone = (Dog) ois.readObject();
//    }catch (IOException e) {
//        e.printStackTrace();
//    }
//    owner.setName("Pudge");
//    System.out.println(dog);
//    System.out.println(clone);
    

    }
    }