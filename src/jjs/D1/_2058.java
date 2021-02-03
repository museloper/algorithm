package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2058 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D1/_2058.txt"));

		scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine().trim());
		
		int sum = 0;
		
		while(num  > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println(sum);
		
		// RUNTIME : 0.12903s
	}

}
