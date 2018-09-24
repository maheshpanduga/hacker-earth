package com.mahi.hackerearth.capillary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;

public class BinaryMatrix {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();

		int row = 0;
		BigDecimal value = new BigDecimal(0);
		for (int i = 0; i < NM[0]; i++) {
			BigDecimal n = convertToDecimal(new StringBuilder(br.readLine()));
			if(n.compareTo(value) == 1){
				row = i;
				value = n.max(value);
			}
		}
		br.close();
		
		System.out.println(row+1);
	}
	
	public static BigDecimal convertToDecimal(StringBuilder binary){
		BigDecimal number = new BigDecimal(0);
		BigDecimal two = new BigDecimal(2);
		char[] bits = binary.reverse().toString().toCharArray();
		for (int i = 0; i < bits.length; i++) {
			if(bits[i] == '1'){
				number = number.add(two.pow(i));
			}
		}
		
		return number;
	}
}
