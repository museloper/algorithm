package jjs.D1;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1933 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input/_1933.txt"));
		
		scanner = new Scanner(System.in);
		
		int num = Integer.parseInt(scanner.nextLine().trim());
		int loop = 1;
		List<Integer> divisor = new ArrayList<Integer>();
		
		while(num >= loop) {
			if(num % loop == 0) {
				divisor.add(loop);
			}
			++loop;
		}
		
		for(int res : divisor) {
			System.out.print(res + " ");
		}
		
		// RUNTIME : 0.12366s
	}
}
