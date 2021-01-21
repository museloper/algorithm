package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1989 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1989.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			String str = scanner.nextLine();
			
			String front = "";
			String back = "";
			
			boolean palindrome = false;
			
			for(int j=0; j<str.length(); j++) {
				if(j+1>str.length()/2) break;
				front = str.substring(j, j+1);
				back = str.substring(str.length()-j-1, str.length()-j);

				if(front.equals(back)) {
					palindrome = true;
				} else {
					palindrome = false;
					break;
				}
			}
			
			if(palindrome) {
				System.out.println("#"+(i+1) + " " + 1);
			} else {
				System.out.println("#"+(i+1) + " " + 0);
			}
		}
		
		// RUNTIME : 0.12302s
	}

}
