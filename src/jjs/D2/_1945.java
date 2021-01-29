package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1945 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1945.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			int num = Integer.parseInt(scanner.nextLine().trim());
			
			int power_2 = 0;
			int power_3 = 0;
			int power_5 = 0;
			int power_7 = 0;
			int power_11 = 0;
			
			// 2
			while(num%2 == 0) {
				num /= 2;
				++power_2;
			};
			
			// 3
			while(num%3 == 0) {
				num /= 3;
				++power_3;
			}
			
			// 5
			while(num%5 == 0) {
				num /= 5;
				++power_5;
			}
			
			// 7
			while(num%7 == 0) {
				num /= 7;
				++power_7;
			}
			
			// 11
			while(num%11 == 0) {
				num /= 11;
				++power_11;
			}
			
			System.out.println("#"+(i+1) + " " + power_2 + " " + power_3 + " " + power_5 + " " + power_7 + " " + power_11);
		}
		
		// RUNTIME : 0.12200s
	}

}
