package com.mahi.hackerearth.TrustingSocial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DetermineTheWinner {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int[] initScores = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			int[] decScores = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			int[] flashSubmits = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			int[] ciscoSubmits = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			
			int initHalf = 0;
			int decScore = 0;
			int flashScore = 0;
			for (int j = 0; j < 4; j++) {
				initHalf = initScores[j]/2;
				decScore = decScores[j]*flashSubmits[j];
				flashScore = initHalf < decScore ? Math.max(decScore, initHalf) : initScores[0]-decScore;
			}
			
			int ciscoScore = 0;
			for (int j = 0; j < 4; j++) {
				initHalf = initScores[j]/2;
				decScore = decScores[j]*ciscoSubmits[j];
				ciscoScore = initHalf < decScore ? Math.max(decScore, initHalf) : initScores[0]-decScore;
			}
			
			
			if(flashScore > ciscoScore)
				output.append("Flash\n");
			else if(flashScore < ciscoScore)
				output.append("Cisco\n");
			else if(flashScore == ciscoScore && Arrays.stream(flashSubmits).max().getAsInt() == Arrays.stream(ciscoSubmits).max().getAsInt())
				output.append("Tie\n");
			else if(flashScore == ciscoScore && Arrays.stream(flashSubmits).max().getAsInt() < Arrays.stream(ciscoSubmits).max().getAsInt())
				output.append("Flash\n");
			else if(flashScore == ciscoScore && Arrays.stream(flashSubmits).max().getAsInt() > Arrays.stream(ciscoSubmits).max().getAsInt())
				output.append("Cisco\n");
		}
		
		System.out.println(output.toString());
		
		br.close();
	}
}
