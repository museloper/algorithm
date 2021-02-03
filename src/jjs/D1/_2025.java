package jjs.D1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _2025 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input/D1/_2025.txt"));
		
		scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine().trim());
		
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			sum += (i+1);
		}
		
		System.out.println(sum);
		
		// RUNTIME : 0.12390s
	}

}
