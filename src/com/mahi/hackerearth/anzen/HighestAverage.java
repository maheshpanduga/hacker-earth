package com.mahi.hackerearth.anzen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HighestAverage {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder output = new StringBuilder();
		int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		int Q = Integer.parseInt(br.readLine());
		int[] kk = new int[Q];
		for (int i = 0; i < Q; i++) {
			int K = Integer.parseInt(br.readLine());
			kk[i] = K;
        }
		
		int max = Arrays.stream(kk).sorted().max().getAsInt();
		/*knapsackArray(K, N, numbers, knapsack, keep);
		for (int i = 0; i < kk.length; i++) {
			int[][] knapsack = ;
			int[][] keep;
			
		}*/
		
		
		System.out.println(output.toString());
		
		br.close();
    }
	
	private static void knapsackArray(int K,int N, int[] numbers, int[][] knapsack, int[][] keep){
		
	}
}
