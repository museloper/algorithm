package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1976 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D2/_1976.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			String[] str = scanner.nextLine().split(" ");
			
			int hour1 = Integer.parseInt(str[0]);
			int minute1 = Integer.parseInt(str[1]);
			int hour2 = Integer.parseInt(str[2]);
			int minute2 = Integer.parseInt(str[3]);
			
			int hour = 0;
			int minute = 0;
			
			hour = hour1 + hour2;
			if(hour > 12) {
				hour -= 12;
			}
			
			minute = minute1 + minute2;
			if(minute > 60) {
				minute -= 60;
				hour += 1;
			}
			
			System.out.println("#"+(i+1) + " " + hour + " " + minute);
		}
		
		// RUNTIME : 0.12103s
	}

}
