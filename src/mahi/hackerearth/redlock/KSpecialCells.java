package mahi.hackerearth.redlock;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KSpecialCells {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int[] NMK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
			int N = NMK[0];
			int M = NMK[1];
			int K = NMK[2];
			int[][] elements = new int[K][3];
			for (int j = 0; j < K; j++) {
				int[] XYP = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
				int X = XYP[0], Y = XYP[1], P = XYP[2];
				elements[j][0] = X-1;
				elements[j][1] = Y-1;
				elements[j][2] = P;
			}
			
			System.out.println(getStrength(elements, 0,N, M, 0, 0));
		}
		
		br.close();
	}
	
	public static int getStrength(int[][] elements, int sum, int N, int M, int rowIndex, int colIndex){
		
		if(rowIndex == N-1 && colIndex == M-1){
			return sum + getValue(elements,rowIndex,colIndex);
		}
		
		if(rowIndex == N-1)
			return getStrength(elements,sum+getValue(elements,rowIndex,colIndex), N, M, rowIndex, colIndex+1);
		
		if(colIndex == M-1)
			return getStrength(elements,sum+getValue(elements,rowIndex,colIndex), N, M, rowIndex+1, colIndex);
		
		
		
		return getStrength(elements, sum+getValue(elements,rowIndex,colIndex), N, M, rowIndex+1, colIndex) + getStrength(elements, sum+getValue(elements,rowIndex,colIndex), N, M, rowIndex, colIndex+1);
	}
	
	public static int getValue(int[][] elements, int rowIndex, int colIndex){
		
		for (int i = 0; i < elements.length; i++) {
			if(elements[i][0] == rowIndex && elements[i][1] == colIndex)
				return elements[i][2];
		}
		
		return 0;
	}
}
