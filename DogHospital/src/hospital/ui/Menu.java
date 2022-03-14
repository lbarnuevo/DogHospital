package hospital.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		System.out.println("Welcome to Dog Hospital"); //sysout + ctrl + espace
		try {
			do {
				System.out.println("Please choose an option");
				System.out.println("1. Whatever A");
				System.out.println("2. Whatever B");
				System.out.println("0. Exit");
				
				int choice = Integer.parseInt(reader.readLine());
				switch(choice) {
				case 1:
					// Call method for whatever A
					break;
				case 2:
					// Call method for whatever B
					// Random comment
					break;
				case 0:
					System.exit(0);
				default: 
					break;
				}
				
			} while(true);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
