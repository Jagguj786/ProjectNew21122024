package com.collections;

import java.util.ArrayList;
import java.util.List;

public class SizeOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of List<Integer> 
        List<Integer> Array_List = new ArrayList<Integer>(); 
  
        // add elements  
        Array_List.add(1); 
        Array_List.add(2); 
        Array_List.add(3); 
        Array_List.add(3); 
  
        // getting total size of list 
        // using size() method 
        int size = Array_List.size(); 
  
        // print the size of list 
        System.out.println("Size of list = " + size); 
  
        // print list 
        System.out.println("Array_List = " + Array_List); 
        
        //to get 2nd index element
        System.out.println(Array_List.get(2));
	}

}
