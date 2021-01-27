package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1970 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1970.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i ++) {
			
			int money = Integer.parseInt(scanner.nextLine().trim());
			
			int change_50000 = money/50000;
			money %= 50000;
			
			int change_10000 = money / 10000;
			money %= 10000;
			
			int change_5000 = money / 5000;
			money %= 5000;
			
			int change_1000 = money / 1000;
			money %= 1000;
			
			int change_500 = money / 500;
			money %= 500;
			
			int change_100 = money / 100;
			money %= 100;
			
			int change_50 = money / 50;
			money %= 50;
			
			int change_10 = money / 10;
			money %= 10;
			
			System.out.println("#"+(i+1));
			System.out.println(change_50000 + " " + change_10000 + " " + change_5000 + " " + change_1000 + " " + change_500 + " " + change_100 + " " + change_50 + " " + change_10);
		}
		
		// RUNTIME : 0.12292s
	}

}
