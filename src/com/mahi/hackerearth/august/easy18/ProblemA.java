package com.mahi.hackerearth.august.easy18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ProblemA {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
		for (int i = 65; i < 91; i++) {
			characters.put((char)i, i-64);
		}
		int N = Integer.parseInt(br.readLine());
		String[][] st = new String[N][N];
		for (int i = 0; i < 2; i++) {
			st[i] = br.readLine().split("");
		}
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			count = count + convertCharacter(characters.get(st[0][i].charAt(0)), characters.get(st[1][i].charAt(0)), characters);
		}
		
		br.close();
		System.out.println(count);
	}
	
	public static int convertCharacter(int from, int to, HashMap<Character, Integer> characters){
		if(from > to)
			to = to + 13;
		
		int count = 0;
		if(from == to)
			return count;
		
		int days = to/13;
		int days2 = Math.abs((to-from)%13);
		
		return days + days2;
	}
}
