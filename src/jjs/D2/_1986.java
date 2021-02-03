package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1986 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D2/_1986.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			int nextInt = Integer.parseInt(scanner.nextLine().trim());
			int sum = 0;

			for(int j=1; j<nextInt+1; j++) {
				if(j%2 == 0) {
					sum += -j;
				} else {
					sum += j;
				}
			}
			System.out.println("#"+(i+1) + " " + sum);
		}
		
		// RUNTIME : 0.12407s
	}

}
