package com.mahi.hackerearth.servicenow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PopupOrientation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			
			builder.append(getOreintation(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5])+"\n");
		}
		
		System.out.println(builder.toString());
	}
	
	public static String getOreintation(int x, int y, int l, int m, int a, int b){
		/*if(x-a > l && y-b < m )
			return "bottom-right";
		if(x-a < l && y-b < m )
			return "bottom-left";
		if(x-a > l && y-b > m )
			return "top-right";
		if(x-a < l && y-b > m )
			return "top-left";*/
		
		if(x-a >= l && b >= m )
			return "bottom-right";
		if(x-a < l && y-b < m )
			return "bottom-left";
		if(x-a > l && y-b > m )
			return "top-right";
		if(x-a < l && y-b > m )
			return "top-left";
		
		return "";
	}
}
