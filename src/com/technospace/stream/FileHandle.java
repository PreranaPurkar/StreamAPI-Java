package com.technospace.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileHandle {

	public static void main(String[] args) throws IOException {
		Stream<String> lines = Files.lines(Path.of("C:\\Users\\Prerana Purkar\\Desktop\\DataHndelDemo.txt"));
		lines.forEach(System.out::println);
	
		//Find the name start with G
		//List<String> name = lines.filter(x-> x.contains("G")).collect(Collectors.toList());
		//System.out.println("Name is Start with G is = "+name);
	}

}
