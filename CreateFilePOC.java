package com.cg.basicjava;

import java.io.File;
import java.io.IOException;

public class CreateFilePOC {
	public static void main(String args[]) throws IOException {
		File file = new File("D://.conf");

		// Create the file
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");

		}
	}
}
