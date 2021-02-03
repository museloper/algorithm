package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2050 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D1/_2050.txt"));

		scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		char[] varchar = str.toCharArray();
		
		for(char convert : varchar) {
			System.out.print(convert-64 + " ");
		}
		
		// RUNTIME : 0.12832s
	}

}
