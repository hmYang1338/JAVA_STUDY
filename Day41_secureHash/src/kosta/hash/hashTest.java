package kosta.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
/**
 * MD5, SHA-1
 * 해시코드가 실행할 때마다 항상 같기 때문에
 * SecureRandom을 사용하여 값을 변하게 한다
 * 
 * 해시알고리즘 => 복호화안됨
 */
public class hashTest {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String msg1 = "Hello";
		String msg2 = "Hello.";
		
		// 시큐어랜덤값 생성
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
