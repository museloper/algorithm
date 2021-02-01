package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1940 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1940.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			int time = Integer.parseInt(scanner.nextLine().trim());
			
			int distance = 0;
			int velocity = 0;
			
			for(int j=0; j<time; j++) {
				String[] str = scanner.nextLine().split(" ");
				
				int select = Integer.parseInt(str[0]);
				int shift;
				
				if(select != 0) {
					shift = Integer.parseInt(str[1]);
				} else {
					shift = 0;
				}
				
				if(select == 0) {
					// 등속
					velocity += shift;
				} else if(select == 1) {
					// 가속
					velocity += shift;
				} else if(select == 2) {
					// 감속
					velocity -= shift;
				}
				
				if(velocity < 0) {
					velocity = 0;
				}
				
				distance += velocity;
			}
			
			System.out.println("#"+(i+1) + " " + distance);
		}
		
		// RUNTIME : 0.12527s
	}

}
