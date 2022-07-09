package com.mahi.hackerearth.latest2022;

import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class WorldArmy {
	public static void main(String[] args) {
		 stressTester();
		//consoleTester();
	}

	public static void stressTester() {

		Random random = new Random(1);
		int n = random.nextInt(1000);
		random = new Random(0);
		for (int i = 0; i < n; i++) {
			StringBuilder output = new StringBuilder();
			int h1 = random.nextInt(24);
			int m1 = random.nextInt(60);
			int h2 = random.nextInt(24);
			int m2 = random.nextInt(60);
			
			int hours = (h1 + h2) % 24;
			int mins = (m1 + m2) % 60;
			
			int extraHours = (m1 + m2) / 60;
			
			hours = hours + extraHours;
			output.append(String.format("%02d", hours)+" "+String.format("%02d", mins));
			System.out.println(h1 +" "+ m1);
			System.out.println(h2 +" "+ m2);
			System.out.println(output.toString());
			System.out.println("=============================");
		}
	}

	public static void consoleTester() {
		Scanner scanner = new Scanner(new InputStreamReader(System.in));

		StringBuilder output = new StringBuilder();
		int h1 = scanner.nextInt();
		int m1 = scanner.nextInt();
		int h2 = scanner.nextInt();
		int m2 = scanner.nextInt();
		
		int hours = (h1 + h2) % 24;
		int mins = (m1 + m2) % 60;
		int extraHours = (m1 + m2) / 60;
		
		hours = hours + extraHours;
		output.append(String.format("%01d", hours)+" "+String.format("%01d", mins));
		System.out.println(output.toString());
		scanner.close();
	}

}
