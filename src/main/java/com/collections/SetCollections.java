package com.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		//Set Collections
		Set<String> s = new HashSet<>();
		
		System.out.println(s);
		
		//Set Collection will not follow order so printing in Different order 
		s.add("Sachin");
		s.add("Ramesh");
		s.add("Tendulkar");
		s.add("Ramesh");
		System.out.println(s);
		
		//Set to array conversion
		Object[] ob = s.toArray();
		System.out.println(ob);
		
		for(int i=0;i<=ob.length-1;i++) {
			System.out.println(ob[i]);
		}		
		
		//List Clooections
		List<String> lt = new LinkedList<>();
		
		lt.add("Team1");
		lt.add("Team2");
		
		
		
		//Store Array in Set or List or Map
		String[] str = {"hdg","uery","dpf","dhf"};
		
		Set<String> st = new HashSet<>();
		
		st.addAll(Arrays.asList(str));

		
		System.out.println(st);
		
		
		
		//Map Collections
		Map<String,String> mp = new HashMap<>();
		
		mp.put("Abc", "Test");
		mp.put("Xyz", "Test23");
		
		System.out.println(mp);
		
	}

}
