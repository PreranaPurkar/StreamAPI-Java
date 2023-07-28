package com.technospace.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		String[] name = {"Raghav","Rajendra","","Rajiv","","Ramesh","Rani"};
		
		//Count names which contain R/r
		int count = 0;
		System.out.println("Length="+name.length);
		for(int i = 0; i < name.length; i++) {	
			if(name[i].contains("R") || name[i].contains("r")) {
				count++;
			}
		}
		System.out.println("No of Names having R or r="+count);
		
		//Count Strings having length more than 5
		count = 0;
		System.out.println("Length="+name.length);
		for(int i = 0; i < name.length; i++) {
			if(name[i].length() >= 5) {
				count++;
			}
		}
System.out.println("No of Names having more than 5 Length="+count);
 		
		}

}
