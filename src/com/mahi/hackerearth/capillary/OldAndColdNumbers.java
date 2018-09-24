package com.mahi.hackerearth.capillary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OldAndColdNumbers {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			List<Long> numbers = Arrays.stream(br.readLine().split(" ")).map(Long::valueOf).collect(Collectors.toList());
			int Q = Integer.parseInt(br.readLine());
			
			IntStream.range(0, Q).parallel().forEach(e ->{
				String[] lr = null;
				try {
					lr = br.readLine().split(" ");
				} catch (Exception e1) {
				}
				int[] LR = Arrays.stream(lr).mapToInt(Integer::valueOf).toArray();
				List<Long> sub = numbers.subList(LR[0]-1, LR[1]);
				int oddCount = (int)sub.stream().filter(ele -> ele%2 != 0).count();
				int evenCount = sub.size() - oddCount;
				
				int steps = 0;
				
				while(oddCount > evenCount){
					
					oddCount--;
					evenCount++;
					steps++;
				}
				
				output.append(steps + "\n");
			});
		}

		System.out.println(output.toString());
	}
	
	
	/*public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			long[] numbers = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
			int Q = Integer.parseInt(br.readLine());
			for (int j = 0; j < Q; j++) {
				int[] LR = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
				long[] sub = Arrays.copyOfRange(numbers, LR[0]-1, LR[1]);
				int oddCount = (int)Arrays.stream(sub).filter(ele -> ele%2 != 0).count();
				int evenCount = sub.length - oddCount;
				
				int steps = 0;
				
				while(oddCount > evenCount){
					
					oddCount--;
					evenCount++;
					steps++;
				}
				
				output.append(steps + "\n");
			}
		}

		System.out.println(output.toString());
	}*/
}
