package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1948 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1948.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			String[] str = scanner.nextLine().split(" ");
			
			int month1 = Integer.parseInt(str[0]);
			int day1 = Integer.parseInt(str[1]);
			int month2 = Integer.parseInt(str[2]);
			int day2 = Integer.parseInt(str[3]);

			int[] days = {
				0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
			};
			
			int sus = 0;
			
			if(month2 == month1) {
				System.out.println("#"+(i+1) + " " + (day2-day1+1));
			} else {
				for(int j=month1; j<month2; j++) {
					sus += days[j];
				}
				
				System.out.println("#"+(i+1) + " " + (sus-day1+1+day2));
			}
			
			// RUNTIME : 0.12244s
		}
	}

}
