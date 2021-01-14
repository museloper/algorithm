package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2029 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_2029.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			String[] str = scanner.nextLine().split(" ");
			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			System.out.println("#"+(i+1) + " " + (a/b) + " " + (a%b));
		}
		
		// RUNTIME : 0.12418s
	}

}
