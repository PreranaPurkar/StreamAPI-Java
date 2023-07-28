
package com.technospace.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPract1 {

	public static void main(String[] args) {
		//Simple Array
		String[] name = {"Priya","","Pratik","Pranav","","Kiyara","","Lalita",""};
		
		//List Collection object
		List<String> listname = Arrays.asList(name);
		
		//Name which are not empty
		List<String> nonEmpty = listname.stream().filter(x-> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(nonEmpty);
	}

}

