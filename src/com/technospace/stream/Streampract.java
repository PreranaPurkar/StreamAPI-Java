package com.technospace.stream;

import java.util.Arrays;
import java.util.List;

public class Streampract {

	public static void main(String[] args) {
		
		 //Simple Array
		String[] name = {"Ram","","Raghav","","Rajiv","Raman","","Rani","karan","Rajeshwari"};
		
		//List Collection Object
		List<String> nameList = Arrays.asList(name);
		
		//Count names which contain R/r
		int countnames = (int) nameList.stream().filter(x-> x.contains("R")).count();
		System.out.println("Names with R ="+countnames);

		//Count Strings having length more than 5
		long countlength = nameList.stream().filter(x->x.length()>=5).count();
		System.out.println("No of Names having more than 5 Length= "+countlength);
		
		}

}
