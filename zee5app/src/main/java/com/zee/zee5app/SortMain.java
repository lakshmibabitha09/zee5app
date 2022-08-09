package com.zee.zee5app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1,"b");
		map.put(2,"a");
		map.put(-1, "d");
		map.put(null, "cbc");
		
		//System.out.println(map);
		//System.out.println(map.get(null));
		
		/*for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key);
			
		}
		*/
		
		
		
		map.forEach((k,v)->{System.out.println(k+"  "+v);});
		System.out.println(map.containsKey(1));
	

	}

}
