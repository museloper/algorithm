package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1954 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1954.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			int size = Integer.parseInt(scanner.nextLine().trim());
			
			_1954 method = new _1954();
			
			// 2차원 배열 생성
			int[][] arr = new int[size][size];
			
			int num = 0;
			
			int row = 0;
			int col = 0;
			
			System.out.println("#"+(i+1));
			
			while(true) {
				
				try {
					// 고의적 익셉션 발생을 위한 로직 
					if(arr[row][col] == 0) {
					}
					
					// ROW가 가득 차 있으면 ROW++
					boolean full = true;
					
					for(int r=0; r<size; r++) {
						if(arr[row][r] == 0) {
							full = false;
							break;
						}
					}
					
					if(full) {
						row++;
					}
					
					
					// 현재 위치의 값이 0이면 데이터 삽입
					if(arr[row][col] == 0) {
						arr[row][col] = ++num;
						++col;
						
						// 배열의 크기만큼 데이터가 삽입되었으면 반복문 종료
						if(num == size*size) {
							break;
						}
						
					// 현재 위치의 값이 0이 아니면 COL++
 					} else if(arr[row][col] != 0) {
						++col;
						continue;
					} 
					
				} catch (Exception e) {
					// COL 참조가 벗어났을 때 배열 회전
					arr = method.rotation(arr, size);
					row = 0;
					col = 0;
				}
			}
			
			// 배열 회전 정렬
			while(arr[0][0] != 1) {
				arr = method.rotation(arr, size);
			}
			
			for(int j=0; j<size; j++) {
				for(int k=0; k<size; k++) {
					System.out.print(arr[j][k] + " ");
				}
				System.out.println();
			}
		}
		
		// RUNTIME : 0.12894s
	}
	
	private int[][] rotation(int[][] arr, int size) {
		int[][] newArr = new int[size][size];
		
		for(int j=0; j<size; j++) {
			for(int k=0; k<size; k++) {
				newArr[size-k-1][j] = arr[j][k];
			}
		}
		
		return newArr;
	}

}
