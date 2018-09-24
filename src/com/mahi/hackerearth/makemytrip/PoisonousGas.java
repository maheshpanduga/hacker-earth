package com.mahi.hackerearth.makemytrip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.IntPredicate;

public class PoisonousGas {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			IntPredicate predicate = (x) -> x > 0;
			int sum = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).filter(predicate).sum();
			if(sum % 2 == 0){
				int reminder = 0;
				int number = 0;
				while(sum > 0 ){
					number = sum;
					sum = sum / 2;
					reminder = number % 2;
					if(sum == 1){
						builder.append("Yes\n");
						break;
					}
					if(reminder == 1){
						builder.append("No\n");
						break;
					}
				}
			}else
				builder.append("No\n");
			
		}
		
		System.out.println(builder.toString());
	}
	
}
