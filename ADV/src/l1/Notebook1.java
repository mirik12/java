package l1;

public class Notebook1 {
private String mark;
private double screen;
private int keysNumber;

public Notebook1(String mark, double screen, int keysNumber) {
    this.mark = mark;
    this.screen = screen;
    this.keysNumber = keysNumber;
}

public Notebook1() {
    
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
package l1;

public class Test {
    public static void main(String[] args) {
        char[] smth = {'i','t','e','a'};
        System.out.println(smth);
    }

}