package com.cg.basicjava;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreatingDirectory {

	public static void main(String[] args) throws IOException {
		// Declaring variables
		String driveName, projectName, worksSpaceName, continueLoop, folderToBeCreated;
		boolean loopInput = true, status;

		Scanner scanner = new Scanner(System.in);

		// Making an empty directory for the input project name

		while (loopInput) {
			// Asking User which Drive they want the folder to be in
			// Asking user the name of the project to be created
			System.out.println("Enter the Drive name where you want the folder to be in and"
					+ " the name of the workspace and project you want to create");

			driveName = scanner.nextLine();
			worksSpaceName = scanner.nextLine();
			projectName = scanner.nextLine();

			folderToBeCreated = driveName + ":\\" + worksSpaceName + "\\" + projectName;

			Path path = Paths.get(folderToBeCreated);
			File file = new File(folderToBeCreated);

			// checking if the directory exists
			if (!Files.exists(path)) {
				status = file.mkdirs();

				if (status)
					System.out.println("Directory created");
				else
					System.out.println("Some error occured");

			} else {
				System.out.println("Directory already exists");
			}

			//creating all other folders
			folderToBeCreated += "\\Resources";
			file = new File(folderToBeCreated);
			file.mkdirs();
			
			folderToBeCreated += "\\Policies";
			file = new File(folderToBeCreated);
			file.mkdirs();
			
			folderToBeCreated += "\\Processes";
			file = new File(folderToBeCreated);
			file.mkdirs();
			
			folderToBeCreated += "\\Schemas";
			file = new File(folderToBeCreated);
			file.mkdirs();
			
			folderToBeCreated += "\\Service Descriptors";
			file = new File(folderToBeCreated);
			file.mkdirs();
			
			// Asking user if they want to continue
			System.out.println("Do you wish to continue? Y or N");
			continueLoop = scanner.nextLine();
			if (continueLoop.equalsIgnoreCase("y")) {
				loopInput = true;
			} else {
				loopInput = false;
			}
		}
	}
}
