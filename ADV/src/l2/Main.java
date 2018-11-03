package l2;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog = new Dog("Bobik",5);
        Owner owner = new Owner("Lycantrope");
        dog.setOwner(owner);
        System.out.println(dog);
        Dog clone = (Dog) dog.clone();

    }

}