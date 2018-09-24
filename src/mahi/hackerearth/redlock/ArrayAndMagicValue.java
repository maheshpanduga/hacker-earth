package mahi.hackerearth.redlock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayAndMagicValue {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] elements = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
		boolean[] flags = new boolean[N];
		quickSort(elements, flags, 0, N-1);
		
		long goodsum = 0;
		long bassum = 0;
		
		for (int i = 0; i < flags.length; i++) {
			if(flags[i] == false)
				goodsum = goodsum + elements[i];
			else
				bassum = bassum + elements[i];
		}
		System.out.println(goodsum-bassum);
		br.close();
	}
	
	public static void quickSort(long[] elements, boolean[] flags, int start, int end){
		
		if(start < end){
			int pivotPosition = partition(elements, flags, start, end);
			quickSort(elements, flags, start, pivotPosition-1);
			quickSort(elements, flags, pivotPosition+1, end);
		}
	}
	
	
	public static int partition(long[] elements, boolean[] flags, int start, int end){
		int pivot = start;
		int left = start + 1;
		int right = end;
		boolean isArrangrmentDone = false;
		while(!isArrangrmentDone){
			while( left <= right && elements[left] <= elements[pivot])
				left += 1;
			while( right >= left && elements[right] >= elements[pivot])
				right -= 1;
			
			if(right < left)
				isArrangrmentDone = true;
			else{
				long temp = elements[left];
				elements[left] = elements[right];
				elements[right] = temp;
				flags[left] = flags[right] = true;
			}
		}
		
		long temp = elements[pivot];
		elements[pivot] = elements[right];
		elements[right] = temp;
		flags[pivot] = flags[right] = true;
			
		return right;
	}
	
}
