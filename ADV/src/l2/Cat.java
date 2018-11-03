package l2;

import java.io.Serializable;

public class Cat extends Animal implements Serializable{
    public String color="White";
    private String skin="Sherst";
	
	
	
	private String voice;
    public Cat() {}
    public Cat(String name, int age,String voice) {
        super(name, age);
        this.voice = voice;
    }

    public void getVoice() {
        System.out.println("Miu-miu");
    }

    @Override
    public String toString() {
        return "Cat [voice=" + voice + "]";
    }
}