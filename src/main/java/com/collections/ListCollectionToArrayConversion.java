package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCollectionToArrayConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li = new ArrayList<>();
		
		li.add("Test");
		li.add("Test1");
		li.add("Test2");
		li.add("Test3");
		
		for (String element : li) {
            System.out.println(element);
        }
		
		String[] str = li.toArray(new String[0]);
		
		System.out.println(Arrays.toString(str));
		
		
		
		
	}

}
