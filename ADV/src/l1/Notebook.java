package l1;

public class Notebook {
private String mark;
private double screen;
private int keysNumber;

public Notebook(String mark, double screen, int keysNumber) {
    this.mark = mark;
    this.screen = screen;
    this.keysNumber = keysNumber;
}

public Notebook() {
    
}

public String getMark() {
    return mark;
}
public void setMark(String mark) {
    this.mark = mark;
}
public double getScreen() {
    return screen;
}
public void setScreen(double screen) {
    this.screen = screen;
}
public int getKeysNumber() {
    return keysNumber;
}

public void setKeysNumber(int keysNumber) {
    this.keysNumber = keysNumber;
}
}