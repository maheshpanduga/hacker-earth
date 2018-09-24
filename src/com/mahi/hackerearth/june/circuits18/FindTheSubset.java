package com.mahi.hackerearth.june.circuits18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheSubset {
	private static Map<Long, Long> facts = new HashMap<Long, Long>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] NMD = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
		long[] S = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
		
		
		br.close();
		
		System.out.println(getFactorial(3));
	}
	
	public static long[][] getSubsets(long N, long M){
		
		long K = getFactorial(M)/(getFactorial(M-N)*getFactorial(N));
		long[][] subsets = new long[(int)K][(int)N]; 
		int E = (int) Math.pow(2, M);
		for (int i = 0; i < E-1; i++) {
			
		}
		return null;
	}
	
	public static long getFactorial(long n){
		if(facts.containsKey(n))
			return facts.get(n);
		
		if(n==0 || n==1)
			return 1;
		
		return n*getFactorial(n-1);
	}
}
