package kosta.cryptography;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
/** 
 * ��ĪŰ ��ȣȭ �˰���
 * @author hyunmoYang
 *
 */
public class AESTest {
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
	
		// ��ĪŰ ����
		KeyGenerator generator = KeyGenerator.getInstance("AES");
		generator.init(128);	// 128, 192, 256
		SecretKey secretKey = generator.generateKey();
		byte[] keys = secretKey.getEncoded();
		
		System.out.print("key : ");
		for(byte k : keys) {	// Ű ���
			System.out.printf("%X", k);
		}
		
		// �� �޽���
		String plainText = "Hello";
		System.out.print("\n��ȣȭ �� �� : ");
		byte[] plain = plainText.getBytes();
		for(byte k : plain) {
			System.out.printf("%X", k);
		}
		
		
		// ��ȣȭ
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] encryptText = cipher.doFinal(plainText.getBytes("UTF-8"));
		
		System.out.print("\n��ȣ�� : ");
		for(byte k : encryptText) {
			System.out.printf("%x", k);
		}
	
		
		// ��ȣȭ
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] decryptText = cipher.doFinal(encryptText);
		
		System.out.print("\n��ȣȭ �� �� : ");
		for(byte k : decryptText) {
			System.out.printf("%X", k);
		}
		
	} // end of main
} // end of class
