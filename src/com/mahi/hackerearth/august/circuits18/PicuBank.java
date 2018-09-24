package com.mahi.hackerearth.august.circuits18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PicuBank {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder output = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			long[] DAMBX = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
			output.append(calculateMonths(DAMBX) + "\n");
		}

		br.close();
		System.out.println(output.toString());
	}
	
	public static int calculateMonths(long[] input) {
		long D = input[0];
		long A = input[1];
		long M = input[2];
		long B = input[3];
		long X = input[4];
		
		long sum = D;
		int length = (int) (X/M);
		int months = 0;
		
		for (int i = 1; i < length; i++) {
			
			int c = (int) (i/M);
			if(i  == (c * (M + 1)))
				sum = sum + B;
			else
				sum = sum + A;
			
			if(sum >= X){
				months = i;
				break;
			}
		}
		
		return months;
	}
}
