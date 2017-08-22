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
		
		// �� �޽���
		String plainText = "Hello";
		
		
		// ����Ű/����Ű ����
		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
		generator.initialize(2048);
		KeyPair keypair = generator.generateKeyPair();
		
		PrivateKey privateKey = keypair.getPrivate();
		System.out.println();
		PublicKey publicKey = keypair.getPublic();
		
		
		// ��ȣȭ - ����Ű
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, privateKey);
		byte[] encryptText = cipher.doFinal(plainText.getBytes());
		System.out.print("\n��ȣ�� : ");
		for(byte k : encryptText) {
			System.out.printf("%X", k);
		}
		
		
		// ��ȣȭ - ����Ű
		cipher.init(Cipher.DECRYPT_MODE, publicKey);
		byte[] decryptText = cipher.doFinal(encryptText);
		System.out.print("\n��ȣ�� : ");
		for(byte k : decryptText) {
			System.out.printf("%X", k);
		}
		
		
	} // end of main
} // end of class
