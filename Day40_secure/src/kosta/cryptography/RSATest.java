package kosta.cryptography;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSATest {
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		
		// 평문 메시지
		String plainText = "Hello";
		
		
		// 공개키/개인키 생성
		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
		generator.initialize(2048);
		KeyPair keypair = generator.generateKeyPair();
		
		PrivateKey privateKey = keypair.getPrivate();
		System.out.println();
		PublicKey publicKey = keypair.getPublic();
		
		
		// 암호화 - 개인키
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, privateKey);
		byte[] encryptText = cipher.doFinal(plainText.getBytes());
		System.out.print("\n암호문 : ");
		for(byte k : encryptText) {
			System.out.printf("%X", k);
		}
		
		
		// 복호화 - 공개키
		cipher.init(Cipher.DECRYPT_MODE, publicKey);
		byte[] decryptText = cipher.doFinal(encryptText);
		System.out.print("\n복호문 : ");
		for(byte k : decryptText) {
			System.out.printf("%X", k);
		}
		
		
	} // end of main
} // end of class
