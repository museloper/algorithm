package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2070 {

	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D1/_2070.txt"));

		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			String arr[] = scanner.nextLine().split(" ");
			
			int num1 = Integer.parseInt(arr[0]);
			int num2 = Integer.parseInt(arr[1]);
			
			if(num1 > num2) {
				System.out.println("#"+(i+1) + " " + ">");
			} else if(num1 == num2) {
				System.out.println("#"+(i+1) + " " + "=");
			} else {
				System.out.println("#"+(i+1) + " " + "<");
			}
		}

		scanner.close();
		
		// RUNTIME : 0.12250s
	}

}
