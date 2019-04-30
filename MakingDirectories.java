package com.cg.basicjava;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MakingDirectories {
	public static void main(String[] args) throws IOException {
//		File folder = new File(".");
//		for (File filename : folder.listFiles()) {
//			System.out.println(filename);
//		}
		
		// Taking Required path as a User input
		System.out.println("Enter the required path");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();
//		String fileName = "D:\\drirao.old\\testing";

		// replacing all the "." by "\\"
		String replaceString = fileName.replace('.', '\\');
		System.out.println(replaceString);

		// checking if the path already exists
		Path path = Paths.get(".\\" + replaceString);
		if (!Files.exists(path)) {

			Files.createDirectory(path);
			System.out.println("Directory created");
		} else {

			System.out.println("Directory already exists");
		}
	}
}