package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2068 {

	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_2068.txt"));

		scanner = new Scanner(System.in);

		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			String arr[] = scanner.nextLine().split(" ");
			
			int max = 0;
			
			for(String num : arr) {
				if(max < Integer.parseInt(num)) {
					max = Integer.parseInt(num);
				}
			}
			
			System.out.println("#"+(i+1) + " " + max);
			
			// RUNTIME : 0.12385s
		}
	}

}
