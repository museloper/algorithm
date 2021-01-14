package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2043 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input/_2043.txt"));
		
		scanner = new Scanner(System.in);
		
		String[] number = scanner.nextLine().split(" ");
		
		int password = Integer.parseInt(number[0]);
		int startNum = Integer.parseInt(number[1]);
		
		int cnt = 0;
		
		for(int i=startNum; i<=password; i++) {
			if(startNum == password) {
				break;
			}
			++cnt;
		}
		
		System.out.print(cnt);
		
		// RUNTIME : 0.12797s
	}

}
