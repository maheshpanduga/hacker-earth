package com.mahi.hackerearth.january.circuits;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Road {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] arr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
		
		for (int i = 1; i <= arr[0]; i++) {
			for (int j = 0; j < arr[0]; j++) {
				
			}
		}

		br.close();
	}
}
