package com.cg.basicjava;

import java.util.Scanner;

public class WhileLoopPoc {

	public static void main(String[] args) {
		boolean loopInput = true;
		while (loopInput) {
			System.out.println("iiiii");
			// Asking user if they want to continue
			System.out.println("Do you wish to continue? Y or N");
			Scanner scanner = new Scanner(System.in);
			String ContinueLoop = scanner.nextLine();
			if (ContinueLoop.equalsIgnoreCase("y")) {
				loopInput = true;
			} else {
				System.out.println(ContinueLoop);
				loopInput = false;

			}
			System.out.println(loopInput);
		}

	}

}
