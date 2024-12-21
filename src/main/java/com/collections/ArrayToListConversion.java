package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToListConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = {"Sachin","Dhoni","Kohli","SKY"};
		System.out.println("Arrays Input :"+Arrays.toString(str));
		List li = Arrays.asList(str);
		System.out.println("List Collections :"+li);
		
		//Or
		
		String[] str2 = {"Hardik","Rohit","Ishan","Tilak"};
		List<String> NameList = new ArrayList<>();
        Collections.addAll(NameList, str);
        System.out.println(NameList);
        
        //Or
        
        String countryArray[]= { "India", "Pakistan", "Afganistan","Srilanka" };
     
        List<String> countryList= new ArrayList<>(List.of(countryArray));
     
        System.out.println("Converted ArrayList elements: "+ countryList);
        
		
		
		
	}

}
