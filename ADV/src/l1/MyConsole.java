package l1;

import java.io.Console;

public class MyConsole {
    public static void main(String[] args) {
        boolean access;
        Console console = System.console();
        if(console == null) {
            System.out.println("Use normal OS");
            System.exit(66613);
        } else {
            String login = console.readLine();
            char[] psw = console.readPassword();
            String pass = new String(psw);
            if(login.equals("admin") && pass.equals("itea")) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        
        
        
        
        
    }
}