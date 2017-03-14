package encrypto;

import java.security.MessageDigest;

public class SimpleHash {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String simple = "A String";
		
		MessageDigest md = MessageDigest.getInstance("MD5");
		
		byte[] hash8 = md.digest(simple.getBytes("UTF-8"));
		byte[] hash16 = md.digest(simple.getBytes("UTF-16"));
		
		for(byte b : simple.getBytes("UTF-8"))
			System.out.print(b);
		System.out.println("");
		for(byte b : hash8)
			System.out.print(b + ":");
		System.out.println("");
		System.out.println(hash8.length);

		for(byte b : simple.getBytes("UTF-16"))
			System.out.print(b);
		System.out.println("");
		for(byte b : hash16)
			System.out.print(b + ":");
		System.out.println("");
		System.out.println(hash16.length);
	}

}
