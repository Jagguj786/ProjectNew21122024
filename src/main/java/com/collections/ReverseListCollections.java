package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> li = new ArrayList();
		
		li.add("li1");
		li.add("li2");
		li.add("li3");
		li.add("li4");
		
		System.out.println(li);
		
		Collections.reverse(li);
		
		System.out.println(li);
		
	}

}
