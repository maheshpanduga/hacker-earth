package com.mahi.hackerearth.TrustingSocial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Bugs {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder output = new StringBuilder();
		ArrayList<Integer> bugs = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			int[] options = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			if(options[0] == 1)
				bugs.add(options[1]);
			if(options[0] == 2){
				Collections.sort(bugs, Comparator.reverseOrder());
				int index = bugs.size()/3;
				if(index > 0 )
					output.append(bugs.get(index-1)+"\n");
				else
					output.append("Not enough enemies\n");
			}
		}
		
		System.out.println(output.toString());
		
		br.close();
	}
}
