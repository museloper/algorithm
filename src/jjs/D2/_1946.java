package jjs.D2;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class _1946 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D2/_1946.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			int kind = Integer.parseInt(scanner.nextLine().trim());
			
			ArrayList<String> arr = new ArrayList<String>();
			
			for(int j=0; j<kind; j++) {
				
				String[] str = scanner.nextLine().split(" ");
				
				String alpha = str[0];
				int size = Integer.parseInt(str[1]);
				
				for(int k=0; k<size; k++) {
					arr.add(alpha);
				}
			}
			
			int count = 0;
			
			System.out.println("#"+(i+1));
			
			for(String output : arr) {
				System.out.print(output);
				++count;
				if(count % 10 == 0) {
					System.out.println();
				}
			}
			System.out.println();
		}
		
		// RUNTIME : 0.13211s
	}

}
