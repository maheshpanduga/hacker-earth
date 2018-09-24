package com.mahi.hackerearth.wissen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OneValue {
	public static void main(String[] args) throws Exception {
		StringBuilder output = new StringBuilder();
		StringBuilder input = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		List<Long> elements = new ArrayList<Long>();
		for (int i = 0; i < M; i++) {
			long[] query = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
			if(query[0] == 1)
				elements.add(query[1]);
			if(query[0] == 2)
				elements.remove(Long.valueOf(query[1]));
			if(query[0] == 3){
				if(elements.size() == 0)
					output.append("-1\n");
				else
					output.append(findLeastFrequency(elements).longValue()+"\n");
			}
			if(query[0] == 4){
				if(elements.size() == 0)
					output.append("-1\n");
				else
					output.append(findMaxFrequency(elements).longValue()+"\n");
			}
			
			System.out.println(new ArrayList<>(Arrays.asList(1,3,7)).toString());
		}

		br.close();
		System.out.println(output.toString());
		throw new Exception(input.toString());
	}
	
	public static Long findLeastFrequency(List<Long> elements){
		elements.sort(Comparator.naturalOrder());
		
		LinkedHashMap<Long, Long> values = new LinkedHashMap<Long, Long>();
		for (Long value : elements) {
			if(values.containsKey(value))
				values.put(value, Long.valueOf(values.get(value)+1l));
			else
				values.put(value, Long.valueOf(1l));
		}
		
		Long value = values.values().stream().findFirst().orElse(Long.valueOf(0l));
		
		Long v = values.entrySet().stream().filter(ele -> ele.getValue().compareTo(value) ==0).map(Map.Entry::getKey).max(new Comparator<Long>() {

			@Override
			public int compare(Long o1, Long o2) {
				
				return o1.compareTo(o2);
			}
		}).orElse(0l);
		
		return v;
	}
	
	public static Long findMaxFrequency(List<Long> elements){
		elements.sort(Comparator.reverseOrder());
		
		LinkedHashMap<Long, Long> values = new LinkedHashMap<Long, Long>();
		for (Long value : elements) {
			if(values.containsKey(value))
				values.put(value, Long.valueOf(values.get(value)+1l));
			else
				values.put(value, Long.valueOf(1l));
		}
		
		Long value = values.values().stream().findFirst().orElse(Long.valueOf(0l));
		
		Long v = values.entrySet().stream().filter(ele -> ele.getValue().compareTo(value) ==0).map(Map.Entry::getKey).max(new Comparator<Long>() {

			@Override
			public int compare(Long o1, Long o2) {
				
				return o1.compareTo(o2);
			}
		}).orElse(0l);
		
		return v;
	}
}
