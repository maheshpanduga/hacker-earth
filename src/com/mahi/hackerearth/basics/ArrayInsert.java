package com.mahi.hackerearth.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class ArrayInsert {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] NQ = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		int[] elements = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < NQ[1]; i++) {
			int[] queryElements = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			if(queryElements[0] == 1){
				elements[queryElements[1]] = queryElements[2];
			}else if(queryElements[0] == 2){
				if(queryElements[2] > elements.length-1)
					output.append("-1\n");
				else{
					IntUnaryOperator op = x -> elements[x];
					int sum = (int)IntStream.rangeClosed(queryElements[1], queryElements[2]).map(op).sum();
					output.append(sum+"\n");
				}
			}
		}
		
		System.out.println(output.toString());
		
		br.close();
	}
}
