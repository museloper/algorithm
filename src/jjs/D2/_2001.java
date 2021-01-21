package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2001 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_2001.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			String[] str = scanner.nextLine().split(" ");
			
			int arrSize = Integer.parseInt(str[0]);
			int swatterSize = Integer.parseInt(str[1]);
			
			int[][] arr = new int[arrSize][arrSize];
			
			// 배열 입력
			for(int r=0; r<arrSize; r++) {
				String[] row = scanner.nextLine().split(" ");
				for(int c=0; c<arrSize; c++) {
					arr[r][c] = Integer.parseInt(row[c]);
				}
			}
			
			int max = 0;
			
			// 탐색
			for(int rs=0; rs<arrSize-swatterSize+1; rs++) {
				for(int cs=0; cs<arrSize-swatterSize+1; cs++) {

					int sum = 0;
					
					// 합계
					for(int rm=rs; rm<rs+swatterSize; rm++) {
						for(int cm=cs; cm<cs+swatterSize; cm++) {
							sum += arr[rm][cm];
						}
					}
					
					if(max < sum) {
						max = sum;
					}
				}
			}
			
			System.out.println("#"+(i+1) + " " + max);
		}
		
		// RUNTIME : 0.12881s
	}

}
