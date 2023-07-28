package com.technospace.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSquare {

	public static void main(String[] args) {
		
		//Find the Square of numbers with distinct 
		
		Integer[] number = {2,4,5,6,5,3,4,2,7,8,9};
		//List Collection object
		List<Integer> numList = Arrays.asList(number);
		List<Integer> square = numList.stream().map(x-> x*x).distinct().sorted().collect(Collectors.toList());
		System.out.println(square);
	}

}
