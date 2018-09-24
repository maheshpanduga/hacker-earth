package com.mahi.hackerearth.july.circuits18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ModuloFermatsTheorem {
	public static void main(String[] args) throws Exception {
		StringBuilder output = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int[] NAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			
		}
		
		br.close();
		System.out.println(output.toString());
	}
}
