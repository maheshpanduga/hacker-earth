package com.mahi.hackerearth.kelton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Coins {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] elements = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
		
		int middle = 0;
		
		if(N%2 == 0)
			middle = N/2;
		else
			middle = N/2;
		
		boolean isPossible = false;
		for (int i = middle; i < N; i++) {
			final int index = i;
			int firstHalfSum = Arrays.stream(Arrays.copyOfRange(elements, 0, i)).filter(ele->ele < elements[index]).sum();
			int secondHalfSum = Arrays.stream(Arrays.copyOfRange(elements, i+1, N)).filter(ele->ele > elements[index]).sum();
			
			if(firstHalfSum == secondHalfSum){
				isPossible = true;
				break;
			}
		}
		
		if(isPossible)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		br.close();
	}
}
