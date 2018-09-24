package com.mahi.hackerearth.apostek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EasyQueries {
	public static void main(String[] args) throws Exception {
		StringBuilder output = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] NQ = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		int[] elements = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		for (int i = 0; i < NQ[1]; i++) {
			int[] Q = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			if(Q[0] == 0){
				int leftIndex = -1, rightIndex = -1;
				for (int k = Q[1]+1; k < elements.length; k++) {
					if(elements[k] == 1){
						rightIndex = k;
						break;
					}
				}
				
				for (int j = Q[1]-1; j >=0; j--) {
					if(elements[j] == 1){
						leftIndex = j;
						break;
					}
				}
				output.append(leftIndex +" "+rightIndex+"\n");
			}else if(Q[0] == 1){
				if(elements[Q[1]] == 0)
					elements[Q[1]] = 1;
			}
		}
		br.close();
		
		System.out.println(output.toString());
	}

}
