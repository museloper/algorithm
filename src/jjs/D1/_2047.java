package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2047 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_2047.txt"));

		scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		char[] varchar = str.toCharArray();
		
		for(char convert : varchar) {
			if(convert > 96) {
				System.out.print((char)(convert-32));
			} else {
				System.out.print(convert);
			}
			
		}
		
		// RUNTIME : 0.13063s
	}

}
