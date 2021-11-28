package com.encryption.app;

public class Encryptiondecryption {
	public static void main(String[] args) {
		String str="test";
		int key=6;
		String encrypt = encrypt(str, key);
		System.out.println(encrypt);
		String decrypt = decrypt(encrypt,key);
		System.out.println(decrypt);
	
	}
	
	public static String encrypt(String plainText,int key) {
		StringBuilder sb = new StringBuilder();
		char[] ch = plainText.toCharArray();
		for(char c:ch) {
			c = (char) (c+key);
//			System.out.print(c);
			sb.append(c);
		}
		return sb.toString();
	}
	public static String decrypt(String encrypted,int key) {
		StringBuilder sb = new StringBuilder();
		char[] ch = encrypted.toCharArray();
		for(char c:ch) {
			c = (char) (c-key);
//			System.out.print(c);
			sb.append(c);
		}
		return sb.toString();
	}

}
