package Web;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import web.LoginController;

public class M {

  public static void main(String[] args) {
    MySQLConnector conn = new MySQLConnector();
    LoginController lc = new LoginController(conn.getStatement());
    //String email = "evgeniy@apple.com";
    //String password = "321";
    //System.out.println(lc.login(email, password));
    //System.out.println(lc.register("ss@ss.ss", "123", "London", "Andrew", "M", "hi"));
    String password="admin";
  /*  try {
      MessageDigest md = MessageDigest.getInstance("MD5");
      md.update(StandardCharsets.UTF_8.encode(password));
      System.out.println(String.format("x%032x", new BigInteger(md.digest())));
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }*/
  }

}