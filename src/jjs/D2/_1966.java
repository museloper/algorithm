package jjs.D2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class _1966 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1966.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			int size = Integer.parseInt(scanner.nextLine().trim());
			
			String[] str = scanner.nextLine().split(" ");
			
			int[] arr = new int[size];
			
			// 데이터 입력
			for(int j=0; j<size; j++) {
				arr[j] = Integer.parseInt(str[j]);
			}

			// 정렬
			Arrays.sort(arr);
			
			// 출력
			System.out.print("#"+(i+1) + " ");

			for(int num : arr) {
				System.out.print(num + " ");
			}
			
			System.out.println();
		}
		
		// RUNTIME : 0.12713s
	}

}
