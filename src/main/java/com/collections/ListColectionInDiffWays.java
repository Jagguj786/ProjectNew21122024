package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListColectionInDiffWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//using Arraylist
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		System.out.println(list1);
		
		//Using LinkedList
		List<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(2);
		System.out.println(list2);
		
		//Using Array.asList
		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list3);
		
		//Using List.of
		List<Integer> list4 = List.of(1, 2, 3, 4, 5);
		System.out.println(list4);
		
		//Using Collections.singletonList
		List<String> list5 = Collections.singletonList("singleElement");
		System.out.println(list5);
		
		//Using Stream API
		List<Integer> list6 = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
		System.out.println(list6);
		
		
	}

}
