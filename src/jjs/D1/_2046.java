package jjs.D1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _2046 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input/_2046.txt"));
		
		scanner = new Scanner(System.in);
		
		int cnt = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<cnt; i++) {
			System.out.print("#");
		}
		
		// RUNTIME : 0.13162s
	}

}
