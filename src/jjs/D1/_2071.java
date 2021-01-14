package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2071 {

	private static Scanner scanner;

	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input/_2071.txt"));

		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			String arr[] = scanner.nextLine().split(" ");

			long sum = 0;
			
			for(String num : arr) {
				sum += Integer.parseInt(num);
			}
			
			System.out.println("#"+(i+1) + " " + Math.round((double)sum/arr.length));
		}
		
		scanner.close();
		
		// RUNTIME : 0.12953s

	}

}
