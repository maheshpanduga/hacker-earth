package com.mahi.hackerearth;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class ReUnion {
	/*public static void main(String[] args) throws DecoderException {
		//System.out.println(22 & 2);
		//powerSet("00100", 5);
		//System.out.println(asciiToHex("Ȕ"));
		//System.out.println(hexToAscii("c894"));
		
		String hex = "e280a8";                                  // AAA
		
		Hex hex2 = new Hex("UTF-8");
		System.out.println(Hex.encodeHex("Ȕ".getBytes()));
		String eStr = "383a303420646576656c6f706d656e742070726f67726573732ee280a820";
		System.out.println(new String(Hex.decodeHex(eStr)));
		
		System.out.println(decode(String.valueOf("e280a8")));
		 
	}*/
	
	public static String decode(String hex) {
		ByteBuffer buff = ByteBuffer.allocate(hex.length()/2);
		for (int i = 0; i < hex.length(); i+=2) {
		    buff.put((byte)Integer.parseInt(hex.substring(i, i+2), 16));
		}
		buff.rewind();
		Charset cs = Charset.forName("UTF-8");                              // BBB
		CharBuffer cb = cs.decode(buff);                                    // BBB
		return cb.toString(); 
	}
	
	public String encode(String hex) {
		ByteBuffer buff = ByteBuffer.allocate(hex.length()*2);
		
		for (int i = 0; i < hex.length(); i+=2) {
		    buff.put((byte)Integer.parseInt(hex.substring(i, i+2), 16));
		}
		buff.rewind();
		Charset cs = Charset.forName("UTF-8");                              // BBB
		CharBuffer cb = cs.decode(buff);                                    // BBB
		return cb.toString(); 
	}
	public static int[] powerSet(String nSeq,int n) {
		for (int i = 0; i < (1 << n); i++) {
			String str = "";
			char[] chars = nSeq.toCharArray();
			for (int j = 0; j < n; j++) {
				if(((i >> j) & 1) == 1)
					str+=chars[j];
			}
			
			System.out.println(str);
		}
		return null;
	}
	
	private static String asciiToHex(String asciiStr) {
	    char[] chars = asciiStr.toCharArray();
	    StringBuilder hex = new StringBuilder();
	    for (char ch : chars) {
	        hex.append(Integer.toHexString((int) ch));
	    }
	 
	    return hex.toString();
	}
	
	private static String hexToAscii(String hexStr) {
	    StringBuilder output = new StringBuilder("");
	     
	    for (int i = 0; i < hexStr.length(); i += 2) {
	        String str = hexStr.substring(i, i + 2);
	        output.append((char) Integer.parseInt(str, 16));
	    }
	     
	    return output.toString();
	}
}
