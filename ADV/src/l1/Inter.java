package l1;

import java.util.Locale;
import java.util.ResourceBundle;

public class Inter {

    public static void main(String[] args) {
        
        String lan = "de";
        String country="DE";
        Locale locale = new Locale(lan,country);
        ResourceBundle rs = ResourceBundle.getBundle("resources.MessageBundle",locale);
        System.out.println(rs.getString("greeting"));
    }

}