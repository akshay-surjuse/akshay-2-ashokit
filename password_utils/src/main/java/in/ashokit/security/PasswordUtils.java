package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordUtils
{
	public String encodePassword(String password)
	{
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(password.getBytes());
		String encodedPassword = new String(encode);
		return encodedPassword;
	}
}
