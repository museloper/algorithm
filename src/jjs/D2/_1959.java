package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1959 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input/D2/_1959.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			int size1 = scanner.nextInt();
			int size2 = scanner.nextInt();
			
			int[] arr1 = new int[size1];
			int[] arr2 = new int[size2];
			
			// 배열 데이터 입력
			for(int j=0; j<size1; j++) {
				arr1[j] = scanner.nextInt();
			}
			for(int j=0; j<size2; j++) {
				arr2[j] = scanner.nextInt();
			}
			
			int max = 0;
			
			// 몇 번 반복할 것인지
			if(size1 >= size2) {
				for(int r=0; r<size1-size2+1; r++) {
					int sum = 0;

					for(int m=0; m<size2; m++) {
						sum += arr2[m] * arr1[m+r];
					}
					
					if(max < sum) {
						max = sum;
					}
				}
			} else {
				for(int r=0; r<size2-size1+1; r++) {
					int sum = 0;

					for(int m=0; m<size1; m++) {
						sum += arr1[m] * arr2[m+r];
					}
					
					if(max < sum) {
						max = sum;
					}
				}
			}
			
			System.out.println("#"+(i+1) + " " + max);
		}
		
		// RUNTIME : 0.12904s
	}
}
