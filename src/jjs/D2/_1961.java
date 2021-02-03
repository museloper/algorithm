package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1961 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D2/_1961.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			// 배열 사이즈 
			int size = Integer.parseInt(scanner.nextLine().trim());
			
			// 배열 생성
			int[][] arr = new int[size][size];
			
			// 배열 입력
			for(int j=0; j<size; j++) {
				
				String[] str = scanner.nextLine().split(" ");
				
				for(int k=0; k<size; k++) {
					arr[j][k] = Integer.parseInt(str[k]);
				}
			}
			
			_1961 method = new _1961();
			
			// 출력
			System.out.println("#"+(i+1));
			
			for(int j=0; j<size; j++) {
				
				// 최초 1번 제외하고
				if(j != 0) {
					// 원상복귀(360도)
					arr = method.rotation(arr, size);
				}
				
				// 3번 회전( 90 / 180 / 270 )
				for(int k=0; k<3; k++) {
					
					// 90도 회전
					arr = method.rotation(arr, size);
					
					// 출력
					for(int r=0; r<size; r++) {
						System.out.print(arr[j][r]);
					}
					
					// 한 칸 띄우기
					System.out.print(" ");
				}
				
				// 개행
				System.out.println();
			}
			
			// RUNTIME : 0.13163s
		}
	}
	
	private int[][] rotation(int[][] arr, int size) {
		int[][] newArr = new int[size][size];
		
		for(int j=0; j<size; j++) {
			for(int k=0; k<size; k++) {
				newArr[k][size-1-j] = arr[j][k];
			}
		}
		
		return newArr;
	}

}