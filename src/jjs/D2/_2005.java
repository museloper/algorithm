package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2005 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_2005.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			int floor = Integer.parseInt(scanner.nextLine().trim());
			int[] oldList = new int[floor];
			int[] newList = new int[floor];
			
			System.out.println("#"+(i+1));
			
			for(int j=0; j<floor; j++) {
				for(int k=0; k<j+1; k++) {
					newList[j] = 1;
					
					if(k>0 && j>1) {
						newList[k] = oldList[k] + oldList[k-1];
					}
				}
				for(int o=0; o<j+1; o++) {
					oldList[o] = newList[o];
				}
				
				for(int num : newList) {
					if(num != 0) {
						System.out.print(num + " ");
					}
				}
				System.out.println();
			}
		}
		
		// RUNTIME : 0.12455s
	}

}
