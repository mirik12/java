package hw1;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.ImageIcon;

public class Pudge {
    ImageIcon imagePath = new ImageIcon("images/hw1/pudge.jpeg");
    String lan = "ua";
    String country = "UA";
    Locale locale = new Locale(lan,country);
    ResourceBundle rs = ResourceBundle.getBundle("resources.MessageBundle",locale);
    
    public void setLan(String lan) {
        this.lan = lan;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String saySomething() {
        return rs.getString("something");
    }
    
    public void setLocale(String lan, String country) {
        locale = new Locale(lan,country);
         rs = ResourceBundle.getBundle("resources.MessageBundle",locale);
    }
    

}