package com.mahi.hackerearth.esko;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UnitBalancer {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> Units = Arrays.asList(br.readLine().split(","));
		Map<String, List<String>> equations = new LinkedHashMap<String, List<String>>();
		while(true){
			List<String> eq = Arrays.asList(br.readLine().split(" "));
			if(eq.size() == 0)
				break;
			equations.put(eq.get(0), eq);
		}
		/*for (int i = 0; i < Units.size()-1; i++) {
			List<String> eq = Arrays.asList(br.readLine().split(" "));
			equations.put(eq.get(0), eq);
		}*/

		
		System.out.println(getConvertedUnits(equations, Units).toString());
		
		//throw new Exception(Units+" --- "+equations.toString());
	}
	
	public static StringBuilder getConvertedUnits(Map<String, List<String>> equations,List<String> Units){
		StringBuilder output = new StringBuilder();
		Map<String, String> result = new LinkedHashMap<String,String>();
		Map<Integer, String> result1 = new TreeMap<Integer,String>(Collections.reverseOrder());
		String unit = Units.stream().filter(ele -> !equations.keySet().contains(ele)).findAny().orElse("");
		for (Map.Entry<String, List<String>> entry : equations.entrySet()) {
			result.put(entry.getKey(), convert(equations, entry.getValue(), unit));
			String[] u = convert(equations, entry.getValue(), unit).split(" ");
			result1.put(Integer.parseInt(u[0]), entry.getKey());
		}
		
		int count = 0;
		int pValue = 1;
		for (Map.Entry<Integer, String> entry : result1.entrySet()) {
			List<String> e = equations.get(entry.getValue());
			if(count == 0)
				output.append("1"+e.get(0)+" "+e.get(1)+" "+e.get(2)+e.get(3));
			else
				output.append(" = "+pValue*Integer.parseInt(e.get(2))+e.get(3));
			
			pValue = pValue * Integer.parseInt(e.get(2));
			count++;
		}
		
		return output;
	}
	
	public static String convert(Map<String, List<String>> equations,List<String> eq, String unit){
		String UnitValue = eq.get(2);
		String childUnit = eq.get(3);
		if(unit.equals(childUnit))
			return UnitValue+" "+childUnit;
		String re = convert(equations,equations.get(childUnit),unit);
		String[] subunit = re.split(" ");
		
		return Integer.parseInt(UnitValue) * Integer.parseInt(subunit[0]) +" "+ subunit[1];
	}
}
