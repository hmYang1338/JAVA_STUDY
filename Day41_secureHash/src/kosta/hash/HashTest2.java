package kosta.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * �޽����� �ؽþ˰��� ����/����
 * �ؽþ˰����� �ܹ����̱� ������
 * ������ �ٸ��� ������ ����
 */
public class HashTest2 {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String msg1 = "Hello";
		
		// �۽������� �ؽ� �˰��� ����
		MessageDigest sha1Sender = MessageDigest.getInstance("SHA1");
		sha1Sender.update(msg1.getBytes());
		
		byte[] sha1SenderText = sha1Sender.digest();
		print(sha1SenderText);
		
		// ����(�� - msg1, �ؽþ˰����� ������ MessageDigest -> sha1Text)
		
		
		
		// ���������� ���۵� ���� �ٽ� �ؽ� �˰��� �����Ͽ� MD�� ��
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
