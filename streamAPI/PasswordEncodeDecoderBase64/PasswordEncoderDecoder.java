package streamAPI.PasswordEncodeDecoderBase64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordEncoderDecoder {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String password = "PavithraShetty@123";
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(password.getBytes());
		String encodedPwd = new String(encode);
		System.out.println("Encoded Password : " + encodedPwd);

		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encode);
		String decodedPwd = new String(decode);
		System.out.println("Decoded Password : " + decodedPwd);

		// Encoding and Decoding techniques will not secure our password
		// Encryption - Convert the data to non readable format

		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] digest = md.digest(password.getBytes());
		System.out.println("Encypted Password : " + new String(digest));

		// When we transfer data on the Internet these special / Junk characters will
		// not be understandable by Network protocol so we use Encoding with Encryption
		// to convert those junk characters to readable format. In that way we can
		// secure the passwords on the Internet

		Encoder encoder2 = Base64.getEncoder();
		byte[] encodedBytes = encoder2.encode(digest);
		System.out.println("Encryption + Encoding : " + new String(encodedBytes));

		
	}

}
