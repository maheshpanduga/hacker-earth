package com.mahi.hackerearth.july.circuits18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EasySumSetProblem {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> A = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).sorted().collect(Collectors.toList());
		int M = Integer.parseInt(br.readLine());
		List<Integer> C = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).sorted().collect(Collectors.toList());
		
		Set<Integer> result = new LinkedHashSet<Integer>();
		int start = C.get(0) - A.get(0);
		int last = C.get(C.size()-1) - A.get(A.size()-1);
		
		for (int i = start; i <= last; i++) {
			for (Integer ele : A) {
				if(C.contains(i + ele))
					result.add(i);
			}
		}
		
		br.close();

		System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining(" ")));
		//throw new Exception(A.toString()+" == "+C.toString());
	}
}
