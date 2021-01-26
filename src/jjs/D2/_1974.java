package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1974 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1974.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			boolean pass;
			int sudoku[][] = new int[9][9];
			
			// 스도쿠 입력
			for(int j=0; j<9; j++) {
				String[] line = scanner.nextLine().split(" ");
				
				for(int k=0; k<9; k++) {
					sudoku[j][k] = Integer.parseInt(line[k]);
				}
			}

			
			// 가로줄 검증
			pass = true;
			for(int j=0; j<9; j++) {
				
				int[] number = new int[9];
				
				for(int k=0; k<9; k++) {
					number[sudoku[j][k]-1]++;
				}
				
				for(int s=0; s<9; s++) {
					if(number[s] > 1) {
						pass = false;
					}
				}
			}
			
			if(pass == false) {
				System.out.println("#"+(i+1) + " " + 0);
				continue;
			}
			
			// 세로줄 검증
			for(int j=0; j<9; j++) {
				
				int[] number = new int[9];
				
				for(int k=0; k<9; k++) {
					number[sudoku[k][j]-1]++;
				}
				
				for(int s=0; s<9; s++) {
					if(number[s] > 1) {
						pass = false;
					}
				}
			}
			
			if(pass == false) {
				System.out.println("#"+(i+1) + " " + 0);
				continue;
			}
			
			// 블럭 검증
			pass = true;
			for(int j=0; j<9; j+=3) {
				for(int k=0; k<9; k+=3) {
					
					int[] number = new int[9];
					
					// 블럭 단위
					for(int r=0; r<3; r++) {
						for(int c=0; c<3; c++) {
							number[sudoku[j+r][k+c]-1]++;
						}
					}
					
					for(int s=0; s<9; s++) {
						if(number[s] > 1) {
							pass = false;
						}
					}
				}
			}
			
			if(pass == false) {
				System.out.println("#"+(i+1) + " " + 0);
				continue;
			} else if(pass == true) {
				System.out.println("#"+(i+1) + " " + 1);
			}
		}
		
		// RUNTIME : 0.12593s
	}

}
