package com.mahi.equal.experts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class BSequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] arr = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
		int Q = Integer.parseInt(br.readLine());
		StringJoiner output = new StringJoiner("\n");
		List<Long> eleList = Arrays.stream(arr).boxed().collect(Collectors.toList());;
		for (int i = 0; i < Q; i++) {
			long Qval = Long.parseLong(br.readLine());
			eleList = insertElement(eleList, Qval);
			output.add(eleList.size()+"");
		}
		
		System.out.println(output.toString());
		System.out.println(String.join(" ", eleList.stream().map(String::valueOf).collect(Collectors.toList())));
	}
	
	public static List<Long> insertElement(List<Long> list,long number) {
		long max = list.stream().reduce(Long::max).get();
		if(max == number)
			return list;
		LinkedList<Long> queue = new LinkedList<Long>();
		List<Long> leftList = list.stream().limit(list.indexOf(max)).collect(Collectors.toList());
		List<Long> rightList = list.stream().skip(list.indexOf(max)).collect(Collectors.toList());
		PriorityQueue<Long> leftQueue = new PriorityQueue<>(leftList);
		PriorityQueue<Long> rightQueue = new PriorityQueue<>(10,Comparator.reverseOrder());
		rightQueue.addAll(rightList);
		
		if(!leftList.contains(number)){
			leftQueue.add(number);
			queue.addAll(leftQueue);
			queue.addAll(rightQueue);
			return queue;
		}
	
		if(!rightList.contains(number))
			rightQueue.add(number);
		
		queue.addAll(leftQueue);
		queue.addAll(rightQueue);
		
		return queue;
	}
}
