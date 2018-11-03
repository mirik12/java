package demo;

import java.io.Serializable;

public class Dog implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -4162023372036583572L;
private String name = "Susleg";
private Owner owner;

public Owner getOwner() {
	return owner;
}

public void setOwner(Owner owner) {
	this.owner = owner;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Dog [name=" + name + ", owner=" + owner + "]";
}

}
