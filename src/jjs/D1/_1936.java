package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1936 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1936.txt"));
		
		scanner = new Scanner(System.in);
		
		String[] str = scanner.nextLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		if(A == 1) {
			// A가 가위일 때 A가 이기는 경우는 B가 보
			if(B == 3) {
				System.out.println("A");
			} else if(B == 2) {
				System.out.println("B");
			}
		} else if(A == 2) {
			// A가 바위일 때 A가 이기는 경우는 B가 가위
			if(B == 1) {
				System.out.println("A");
			} else if(B == 3) {
				System.out.println("B");
			}
		} else if(A == 3) {
			// A가 보일 때 A가 이기는 경우는 B가 바위
			if(B == 2) {
				System.out.println("A");
			} else if(B == 1) {
				System.out.println("B");
			}
		}
		
		// RUNTIME : 0.12300s
	}

}
