package com.mahi.hackerearth.september.easy18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PairRecovery {
	public static void main(String[] args) throws Exception {
		StringBuilder output = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] elements = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
		long a3 = elements[0];
		long a4 = elements[1];
		
		long a2 = a4-a3;
		long a1 = a3-a2;
		
		output.append(a1+" "+a2);
		
		br.close();
		
		System.out.println(output.toString());
	}

}
