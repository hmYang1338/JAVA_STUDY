package kosta.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
/**
 * MD5, SHA-1
 * �ؽ��ڵ尡 ������ ������ �׻� ���� ������
 * SecureRandom�� ����Ͽ� ���� ���ϰ� �Ѵ�
 * 
 * �ؽþ˰��� => ��ȣȭ�ȵ�
 */
public class hashTest {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String msg1 = "Hello";
		String msg2 = "Hello.";
		
		// ��ť����� ����
		byte[] random = new byte[10];
		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
		sr.nextBytes(random);
		
		// MD5
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		
		md5.update(random);		// salt
		byte[] md5Msg1 = md5.digest(msg1.getBytes());
		md5.update(random);		// salt
		byte[] md5Msg2 = md5.digest(msg2.getBytes());
	
		System.out.println("MD5");
		System.out.print("msg1 -> ");
		print(md5Msg1);
		System.out.print("msg2 -> ");
		print(md5Msg2);
		
		
		// SHA-1
		MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
		
		sha1.update(random);	// salt	
		byte[] sha1Msg1 = sha1.digest(msg1.getBytes());
		sha1.update(random);	// salt
		byte[] sha1Mag2 = sha1.digest(msg2.getBytes());
		
		System.out.println("SHA-1");
		System.out.print("msg1 -> ");
		print(sha1Msg1);
		System.out.print("msg2 -> ");
		print(sha1Mag2);
		
	} // end of main
	
	public static void print (byte[] bytes) {
		for(byte b : bytes) {
			System.out.printf("%2X", b);
		}
		System.out.println();
	} // end of method
	
} // end of class
