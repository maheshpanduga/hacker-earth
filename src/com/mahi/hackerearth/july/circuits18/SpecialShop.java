package com.mahi.hackerearth.july.circuits18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SpecialShop {
	public static void main(String[] args) throws Exception {
		StringBuilder output = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int[] NAB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			double cost = calculateCost(NAB[1], NAB[2], NAB[0], 0, NAB[0]);
			
			output.append((long)cost+"\n");
		}
		
		br.close();
		System.out.println(output.toString());
	}
	
	public static double calculateCost(int A, int B, int N, int start, int end){
		
		if(start == end)
			return getCost(A, B, start, N-start);
		
		int middle = (start+end)/2;
		double min = Math.min(calculateCost(A, B, N, start, middle),calculateCost(A, B, N, middle+1, end));
		return min;
	}
	
	public static double getCost(int A, int B,int X,int Y){
		
		return A * Math.pow(X, 2) + B * Math.pow(Y, 2);
	}
}
