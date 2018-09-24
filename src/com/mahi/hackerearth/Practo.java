package com.mahi.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        //String name = br.readLine().split(" ").;  
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        int sum = maxSum(arr);
        System.out.println(sum);
	}
	
	public static int maxSum(int[] arr) {
		Arrays.sort(arr);
		int sum = 0;
		for (int i = 0; i < arr.length; i+=2) {
			int min = Math.min(arr[i], arr[i+1]);
			sum+=min;
		}
		return sum;
	}
}
