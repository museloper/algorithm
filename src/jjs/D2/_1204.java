package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1204 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1204.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			int caseNum = Integer.parseInt(scanner.nextLine().trim());
			
			String[] str = scanner.nextLine().split(" ");
			int[] arr = new int[101];
			
			for(int j=0; j<str.length; j++) {
				++arr[Integer.parseInt(str[j])];
			}
			
			int max = 0;
			int idx = 0;
			
			for(int k=0; k<arr.length; k++) {
				if(max <= arr[k]) {
					max = arr[k];
					idx = k;
				}
			}
			
			System.out.println("#"+(i+1) + " " + idx);
		}
		
		// RUNTIME : 0.14837s
	}

}
