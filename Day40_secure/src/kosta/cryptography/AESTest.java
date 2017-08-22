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
 * 대칭키 암호화 알고리즘
 * @author hyunmoYang
 *
 */
public class AESTest {
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
	
		// 대칭키 생성
		KeyGenerator generator = KeyGenerator.getInstance("AES");
		generator.init(128);	// 128, 192, 256
		SecretKey secretKey = generator.generateKey();
		byte[] keys = secretKey.getEncoded();
		
		System.out.print("key : ");
		for(byte k : keys) {	// 키 출력
			System.out.printf("%X", k);
		}
		
		// 평문 메시지
		String plainText = "Hello";
		System.out.print("\n암호화 전 평문 : ");
		byte[] plain = plainText.getBytes();
		for(byte k : plain) {
			System.out.printf("%X", k);
		}
		
		
		// 암호화
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] encryptText = cipher.doFinal(plainText.getBytes("UTF-8"));
		
		System.out.print("\n암호문 : ");
		for(byte k : encryptText) {
			System.out.printf("%x", k);
		}
	
		
		// 복호화
		cipher.init(Cipher.DECRYPT_MODE, secretKey);
		byte[] decryptText = cipher.doFinal(encryptText);
		
		System.out.print("\n복호화 후 평문 : ");
		for(byte k : decryptText) {
			System.out.printf("%X", k);
		}
		
	} // end of main
} // end of class
