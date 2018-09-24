package com.mahi.hackerearth.apostek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BestIndex {
	public static void main(String[] args) throws Exception {
		StringBuilder output = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] elements = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
		long max = 0;
		
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				long sum = 0;
				for (int k = j; k < N; k++) {
					sum = sum + elements[k];
				}
			}
		}
		
		br.close();
		
		System.out.println(output.toString());
	}

}
