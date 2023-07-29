package com.technospace.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseString {

	public static void main(String[] args) {
		String[] name = {"Priya","","Pratik","Pranav","","Kiyara","","Lalita",""};
		
		//Convert String to Uppercase & join them with Comma
		
		List<String> listName = Arrays.asList(name);
		String joinedName = listName.stream().map(x-> x.toUpperCase()).filter(x->!x.isEmpty()).collect(Collectors.joining(","));
		System.out.println("Joined name = "+joinedName);
		
		//Convert String to Lowercase & join them with comma
		
		String lowername = listName.stream().map(x-> x.toLowerCase()).filter(x-> !x.isEmpty()).collect(Collectors.joining(","));
		System.out.println("Joined name = "+lowername);
	}

}
