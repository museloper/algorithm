package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1979 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1979.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			String[] str = scanner.nextLine().split(" ");
			
			int arrSize = Integer.parseInt(str[0]); 
			int strLength = Integer.parseInt(str[1]);

			int[][] puzzle = new int[arrSize][arrSize];
			
			// 데이터 입력
			for(int j=0; j<arrSize; j++) {
				
				String[] arr = scanner.nextLine().split(" ");
				
				for(int k=0; k<arrSize; k++) {
					puzzle[j][k] = Integer.parseInt(arr[k]);
				}
			}
			
			int cnt = 0;
			int continuous;
			
			// 가로탐색
			for(int j=0; j<arrSize; j++) {
				
				continuous = 0;
				
				for(int k=0; k<arrSize; k++) {
					if(puzzle[j][k]==1) {
						++continuous;
					} else if(puzzle[j][k] == 0) {
						continuous = 0;
					}
					
					if(continuous == strLength) {
						++cnt;
					} else if(continuous == strLength+1) {
						--cnt;
					}
				}
			}
			
			// 세로탐색
			for(int j=0; j<arrSize; j++) {
				
				continuous = 0;
				
				for(int k=0; k<arrSize; k++) {
					if(puzzle[k][j]==1) {
						++continuous;
					} else if(puzzle[k][j] == 0) {
						continuous = 0;
					}
					
					if(continuous == strLength) {
						++cnt;
					} else if(continuous == strLength+1) {
						--cnt;
					}
				}
			}
			
			// 출력
			System.out.println("#"+(i+1) + " " + cnt);
			
		}
		
		// RUNTIME : 0.12826s
	}

}
