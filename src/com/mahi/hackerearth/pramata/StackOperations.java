package com.mahi.hackerearth.pramata;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StackOperations {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] NK = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		List<BigDecimal> elements = Arrays.stream(br.readLine().split(" ")).map(new Function<String, BigDecimal>() {
			@Override
			public BigDecimal apply(String t) {
				return new BigDecimal(t);
			}
		}).collect(Collectors.toList());
		
		Stack<BigDecimal> s = new Stack<BigDecimal>();
		s.addAll(elements);
		s.sort(Comparator.reverseOrder());
		
		Stack<BigDecimal> r = new Stack<BigDecimal>();
		long count  = 0;
		
		while (count < NK[1]) {
			BigDecimal max = r.stream().max(Comparator.reverseOrder()).orElse(BigDecimal.ZERO);
			BigDecimal min = r.stream().max(Comparator.reverseOrder()).orElse(BigDecimal.ZERO);
			
			if(count == NK[1]-1)
				s.push(max);
			else
				if(!s.empty())
					r.push(s.pop());
				else
					s.push(min);
				
			count++;
		}
		
		r.sort(Comparator.naturalOrder());
		
		System.out.println(s.empty()? -1 : s.pop());
		
		//throw new Exception(NK[0]+" "+NK[1]+" "+elements);
	}
}
