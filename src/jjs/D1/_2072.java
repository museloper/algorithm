package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2072 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input/D1/_2072.txt"));

		scanner = new Scanner(System.in);
		
		int tc = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<tc; i++) {
			String arr[] = scanner.nextLine().split(" ");

			int sum = 0;
			
			for(int j=0; j<arr.length; j++) {
				int num = Integer.parseInt(arr[j]);
				if(num % 2 != 0) sum += num;
			}
			
			System.out.println("#" + (i+1) + " " + sum);
		}
		
		scanner.close();
		
		// RUNTIME : 0.12937s
	}
}