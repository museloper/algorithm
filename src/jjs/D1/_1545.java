package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1545 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1545.txt"));
		
		scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i = num; i>=0; i--) {
			System.out.print(i + " ");
		}
		
		// RUNTIME : 0.12289s
	}

}
