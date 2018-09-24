package com.mahi.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Add {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int P = Integer.parseInt(br.readLine());
		for (int i = 0; i < P; i++) {
			int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			System.out.println(add(arr[0],arr[1]));
		}
	}
	
	public static int add(int a, int b){
		
		return a + b;
	}
}
