package kosta.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * 메시지와 해시알고리즘 전송/수신
 * 해시알고리즘은 단방향이기 때문에
 * 같은가 다른가 검증만 가능
 */
public class HashTest2 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String msg1 = "Hello";
		
		// 송신측에서 해시 알고리즘 적용
		MessageDigest sha1Sender = MessageDigest.getInstance("SHA1");
		sha1Sender.update(msg1.getBytes());
		
		byte[] sha1SenderText = sha1Sender.digest();
		print(sha1SenderText);
		
		// 전송(평문 - msg1, 해시알고리즘을 적용한 MessageDigest -> sha1Text)
		
		
		
		// 수신측에서 전송된 평문을 다시 해시 알고리즘 적용하여 MD와 비교
		MessageDigest sha1Receiver = MessageDigest.getInstance("SHA1");
		sha1Receiver.update(msg1.getBytes());
		byte[] sha1ReceiverText = sha1Receiver.digest();
		
		boolean result = MessageDigest.isEqual(sha1SenderText, sha1ReceiverText);
		System.out.println(result);
		
		
	} // end of main
	
	public static void print (byte[] bytes) {
		for(byte b : bytes) {
			System.out.printf("%2X", b);
		}
		System.out.println();
	} // end of method
} // end of class
