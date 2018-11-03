package utils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordCoder {
public static String codePassword(String password) {
	 try {
		MessageDigest md=MessageDigest.getInstance("MD5");
		md.update(StandardCharsets.UTF_8.encode(password));
	return String.format("%032x",  new BigInteger(md.digest()));
	} catch (NoSuchAlgorithmException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
}
