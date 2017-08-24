package kosta.hash;

import java.util.Base64;

public class Base64Test {
	public static void main(String[] args) {
		String msg = "abc";

		// 인코딩
		Base64.Encoder e = Base64.getEncoder();
		byte[] encodeBytes = e.encode(msg.getBytes());
		String encodeStr = e.encodeToString(msg.getBytes());
		
		System.out.println(new String(encodeBytes));
		System.out.println(encodeStr);
		
		// 디코딩
		Base64.Decoder d = Base64.getDecoder();
		byte[] decodeBytes = d.decode(encodeBytes);
		byte[] decodeBytes2 = d.decode(encodeStr);
		
		System.out.println(new String(decodeBytes));
		System.out.println(new String(decodeBytes2));
		
	} // end of main
} // end of class
