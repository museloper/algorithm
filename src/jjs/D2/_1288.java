package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1288 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D2/_1288.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			int num = Integer.parseInt(scanner.nextLine().trim());
			int cnt = 0;
			int[] arr = new int[10];
			
			while(true) {
				++cnt;
				
				int numLoop = num*cnt;

				while(numLoop != 0) {
					++arr[numLoop%10];
					numLoop /= 10;
				}
				
				int zeroCnt = 0;
				
				for(int zero : arr) {
					if(zero == 0) {
						++zeroCnt;
					}
				}
				
				if(zeroCnt == 0) {
					System.out.println("#"+(i+1) + " " + num*cnt);
					break;
				}
				
			}
		}
		
		// RUNTIME : 0.12069s
	}

}
