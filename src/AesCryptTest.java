
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AesCryptTest {

	public static void main(String[] args) {
		try {
			String plainText = "(･ω･`U)";
			System.out.println("PLAIN TEXT: " + plainText);

			byte[] key = args[0].getBytes();
			byte[] iv = args[1].getBytes();

			SecretKey cipherKey = new SecretKeySpec(key, "AES");
			IvParameterSpec ivSpec = new IvParameterSpec(iv);
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

			cipher.init(Cipher.ENCRYPT_MODE, cipherKey, ivSpec);
			byte[] encrypt = cipher.doFinal(plainText.getBytes());
			System.out.println("ENCRYPTED : " + Base64.getEncoder().encodeToString(encrypt));

			cipher.init(Cipher.DECRYPT_MODE, cipherKey, ivSpec);
			byte[] decrypt = cipher.doFinal(encrypt);
			System.out.println("DECRYPTED : " + new String(decrypt));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
