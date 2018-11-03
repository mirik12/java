package ua.itea;

public class Pudge {
private String name;
private int level;
@Override
public String toString() {
	return "Pudge [name=" + name + ", level=" + level + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level = level;
}
}

