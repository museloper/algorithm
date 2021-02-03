package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2019 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D1/_2019.txt"));
		
		scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<=num; i++) {
			System.out.print((int)Math.pow(2, i) + " ");
		}
		
		// RUNTIME : 0.12293s
	}

}
