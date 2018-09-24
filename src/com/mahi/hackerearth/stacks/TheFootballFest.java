package com.mahi.hackerearth.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class TheFootballFest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int index = 0; index < T; index++) {
			int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(arr[1]);
			for (int i = 0; i < arr[0]; i++) {
				String[] types = br.readLine().split(" ");
				if(types[0].equals("P"))
					stack.push(Integer.parseInt(types[1]));
				else
					stack.pop();
			}
			System.out.println("Player "+stack.pop());
		}
		
	}
}
