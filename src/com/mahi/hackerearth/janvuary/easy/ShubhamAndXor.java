package com.mahi.hackerearth.janvuary.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShubhamAndXor {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		Arrays.sort(arr);
		int pairCount = 0;
		for (int i = 0; i < N-1; i++) {
			if((arr[i] ^ arr[i + 1]) == 0)
				pairCount++;
		}
		System.out.println(pairCount);
	}
}
