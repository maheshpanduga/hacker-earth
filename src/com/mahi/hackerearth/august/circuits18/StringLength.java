package com.mahi.hackerearth.august.circuits18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class StringLength {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] chars = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
						  "n","o","p","q","r","s","t","u","v","w","x","y","z"
						 };
		StringBuilder output = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split("");
		
		//Collections.frequency(c, o);
		

		br.close();
		System.out.println(output.toString());
	}
}
