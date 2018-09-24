package com.mahi.hackerearth.june.circuits18;

public class K_Subsets {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		boolean[] flags = new boolean[num.length];
	}
	
	public static int[][] getSubsets(int[] num,boolean[] flags,int k,int start, int curLen){
		generateSubsets(num, flags, k, start, curLen);
		
		for (int i = 0; i < flags.length; i++) {
			
		}
		return null;
	}
	
	public static void generateSubsets(int[] num,boolean[] flags, int k, int start, int curLen){
		
		if(start == num.length || k == curLen)
			return;
		
		// if selects TRUE
		flags[start] = true;
		generateSubsets(num, flags, k, start+1, curLen+1);
		
		// if selects FALSE
		flags[start] = false;
		generateSubsets(num, flags, k, start+1, curLen);
	}
}
