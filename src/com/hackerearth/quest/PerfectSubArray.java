package com.hackerearth.quest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PerfectSubArray {
	public static void main(String[] args) throws Exception{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
		int N = Integer.parseInt(tokenizer.nextToken());
		int[] elements = new int[N];
		tokenizer = new StringTokenizer(bufferedReader.readLine());
		int index = 0;
		while (tokenizer.hasMoreTokens()) {
			elements[index++] = Integer.parseInt(tokenizer.nextToken());
		}
		System.out.println(getSubArrays(elements));
	}
	
	public static int getSubArrays(int[] arr){
		int perfectSquaresCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if(isPerfectSquare(sum))
					perfectSquaresCount++;
			}
		}
		
		return perfectSquaresCount;
	}
	public static boolean isPerfectSquare(double number){
		int end = (int)Math.sqrt(number);
		for (int index = 1; index <= end; index++) {
			int result = index * index;
			
			if(result == number)
				return true;
			if(result > number)
				return false;
			
			continue;
		}
		return false;
	}
}
