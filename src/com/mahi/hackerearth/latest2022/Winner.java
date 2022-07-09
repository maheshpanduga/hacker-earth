package com.mahi.hackerearth.latest2022;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Winner {
	public static void main(String[] args) {
		//stressTester();
		consoleTester();
	}
	
	public static void stressTester() {

		Random random = new Random(1);
		StringBuilder output = new StringBuilder();
		int T = 10;
		Random random2 = new Random(2);
		for(int j = 0; j < T; j++) {
			int A = random2.nextInt(10000);
			int N = random2.nextInt(10000);
			int[] items = new int[N];
			for(int i = 0; i < N; i++) {
				items[i] = random.nextInt(10000);
			}
			Arrays.sort(items);
			int[] findItems = findItems(N, A, items);
			System.out.println(N + " " + A + " " + items[findItems[0]-1]+ " " + items[findItems[1]-1]);
			output.append(findItems[0]+" "+findItems[1]+"\n");
		}
		
		System.out.println(output.toString());
	}

	public static void consoleTester() {
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		
		StringBuilder output = new StringBuilder();
		int T = scanner.nextInt();
		for(int j = 0; j < T; j++) {
			int A = scanner.nextInt();
			int N = scanner.nextInt();
			int[] items = new int[N];
			for(int i = 0; i < N; i++) {
				items[i] = scanner.nextInt();
			}
			int[] findItems = findItems(N, A, items);
			output.append(findItems[0]+" "+findItems[1]+"\n");
		}
		
		System.out.println(output.toString());
		scanner.close();
	}
	
	public static int[] findItems(int N, int amount, int[] items) {
		
		int firstIndex = -1;
		int secondIndex = -1;
		outer:
		for (int i = 0; i < N; i++) {
			firstIndex = i;
			for (int j = i + 1; j < N; j++) {
				secondIndex = j;
				if(amount == items[i] + items[j])
					break outer;
			}
		}
		int[] indices = new int[2];
		indices[0] = firstIndex + 1;
		indices[1] = secondIndex + 1;
		return indices;
	}
}
