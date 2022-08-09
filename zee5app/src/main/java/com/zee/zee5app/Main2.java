package com.zee.zee5app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.zee.zee5app.utils.IdComparator;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,7,8,8,8,8,1);
		list.forEach(e->System.out.print(e));//lambda expression
		
		System.out.println("sorted");
		Collections.sort(list,new IdComparator());
		list.forEach(System.out::print);

	}

}
 