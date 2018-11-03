package l2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Dog extends Animal implements Serializable,Externalizable { // интерфейс-маркер --- не заставляет реализовывать методы
private String name;

private int age;
private Owner owner;

public Dog() {}

public Dog(String name, int age) {
    this.name = name;
    this.age = age;
}


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public Owner getOwner() {
    return owner;
}
public void setOwner(Owner owner) {
    this.owner = owner;
}
@Override
public String toString() {
    return "Dog [name=" + name + ", age=" + age + ", owner=" + owner + "]";
}
@Override
protected Object clone() throws CloneNotSupportedException {
    return super.clone();
}

@Override
public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(name);
    out.writeObject(owner);
    out.writeInt(age);
    
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    name = (String) in.readObject();
    owner = (Owner) in.readObject();
    age = in.readInt();
}

}