package kosta.hash;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
/**
 * MAC
 */
public class MACTest {
	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
		String msg1 = "Hello";
		
		// ��ĪŰ ����
		KeyGenerator generator = KeyGenerator.getInstance("AES");
		SecretKey key = generator.generateKey();
		
		// MAC
		// �۽��ڿ��� ����
		Mac mac = Mac.getInstance("HmacSHA1");
		mac.init(key);
		byte[] bytes = mac.doFinal(msg1.getBytes());
		
		print(bytes);
		
		
		// ����(MessageDigest, Key, ��)
		
		
		// �����ڿ��� ��
		Mac mac2 = Mac.getInstance("HmacSHA1");
		mac2.init(key);
		byte[] bytes2 = mac2.doFinal(msg1.getBytes());
		boolean result = MessageDigest.isEqual(bytes, bytes2);
		
		System.out.println(result);
		
	} // end of main
	
	
	public static void print (byte[] bytes) {
		for(byte b : bytes) {
			System.out.printf("%2X", b);
		}
		System.out.println();
	} // end of method
} // end of class
