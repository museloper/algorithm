package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1984 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D2/_1984.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			String[] strArr = scanner.nextLine().split(" ");
			
			int[] numArr = new int[10];
			
			// 배열 입력
			for(int j=0; j<10; j++) {
				numArr[j] = Integer.parseInt(strArr[j]);
			}
			
			int max = numArr[0];
			int min = numArr[0];
			int sum = 0;
			
			// 합계
			for(int k=0; k<10; k++) {
				if(max < numArr[k]) {
					max = numArr[k];
				}
				if(min > numArr[k]) {
					min = numArr[k];
				}
				
				sum += numArr[k];
			}
			
			// 최대값, 최소값을 제외한 평균
			System.out.println( "#"+(i+1) + " " + Math.round(((sum - max - min) / (float)8)) );
		}
		
		// RUNTIME : 0.12557s
	}

}
