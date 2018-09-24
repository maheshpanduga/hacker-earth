package com.mahi.hackerearth.rapid;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TravellingBetweenCities {
	public static void main(String[] args) throws Exception {
		TravellingBetweenCities cities = new TravellingBetweenCities();
		InputReader inputReader = cities.new InputReader();
		 int T  = Integer.parseInt(inputReader.next());
		 for (int i = 0; i < T; i++) {
			 int N = inputReader.nextInt();
			 int K = inputReader.nextInt();
			 int Q = inputReader.nextInt();
			 
			 System.out.println("N = "+N+" Q = "+Q+" K = "+K);
		}
		
		 inputReader.close();
	}
	
	class InputReader{
		BufferedReader br;
		StringTokenizer tokenizer;
		
		public InputReader() throws Exception {
			br = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = new StringTokenizer(br.readLine());
		}
		
		public String next() throws Exception{
			
			if(tokenizer == null || !tokenizer.hasMoreTokens())
				tokenizer = new StringTokenizer(br.readLine());
			
			return tokenizer.nextToken();
		}
		
		public String nextLine() throws Exception{
			
			return br.readLine();
		}
		
		public int nextInt() throws Exception{
			
			return Integer.parseInt(next());
		}
		
		public long nextLong() throws Exception{
			
			return Long.parseLong(next());
		}
		
		public double nextDouble() throws Exception{
			
			return Double.parseDouble(next());
		}
		
		public void close() throws Exception{
			br.close();
		}
	}
}
