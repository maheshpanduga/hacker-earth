package com.mahi.hackerearth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
	public static void main(String[] args) throws Exception{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int res = findFrequency();

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedWriter.close();
	}

	static int findFrequency() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] chars = br.readLine().split("");
		List<String> list = Arrays.asList(chars);
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			count = count + Collections.frequency(list, chars[i]);
		}
		
		
		
		return count;
	}
}
