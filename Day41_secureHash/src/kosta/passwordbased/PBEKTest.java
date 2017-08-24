package kosta.passwordbased;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
/**
 * PasswordȰ�� - PBEK
 * password�� Ű�� Ȱ��
 */
public class PBEKTest {
	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		String password = "1234";
	
		// salt -> SecureRandom
		byte[] salt = new byte[20];
		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
		sr.nextBytes(salt);
		
		// PBKDF2�� �̿��Ͽ� Ű����
		PBEKeySpec keyspec = new PBEKeySpec(password.toCharArray(), salt, 1000, 256);
		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
		SecretKey key = factory.generateSecret(keyspec);
		
		print(key.getEncoded());
		/*
		// ��ȣȭ
		Cipher cipher = Cipher.getInstance("PBEWithHmacSHA256AndAES_128");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		cipher.update(password.getBytes());
		byte[] encryptedText = cipher.doFinal();
		
		print(encryptedText);
		
		// ��ȣȭ
		cipher.init(Cipher.DECRYPT_MODE, key);
		cipher.update(encryptedText);
		byte[] decryptedText = cipher.doFinal();
		
		print(decryptedText);
		*/
	} // end of main
	
	public static void print (byte[] bytes) {
		for(byte b : bytes) {
			System.out.printf("%2X", b);
		}
		System.out.println();
	} // end of method
} // end of class
