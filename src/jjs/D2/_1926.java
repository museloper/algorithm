package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1926 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1926.txt"));
		
		scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=1; i<num+1; i++) {
			int innerNum = i;
			boolean flag = false;
			
			while(innerNum != 0) {
				int judge = innerNum % 10;
				innerNum /= 10;
				
				if(judge%3 == 0 && judge != 0) {
					System.out.print("-");
					flag = true;
				}
			}
			
			if(flag == false) {
				System.out.print(i);
			}
			
			System.out.print(" ");
		}
		
		// RUNTIME : 0.12269s
	}
}
