package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1938 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D1/_1938.txt"));
		
		scanner = new Scanner(System.in);
		
		String str[] = scanner.nextLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		// RUNTIME : 0.12345s
	}

}
