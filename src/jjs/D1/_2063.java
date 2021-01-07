package jjs.D1;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _2063 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_2063.txt"));

		scanner = new Scanner(System.in);
		
		int size = Integer.parseInt(scanner.nextLine().trim());
		
		String arr[] = scanner.nextLine().split(" ");
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(String num : arr) {
			numbers.add(Integer.parseInt(num));
		}
		
		Collections.sort(numbers);
		
		System.out.println(numbers.get( (size-1) / 2) ); // (size-1) / 2
		
		// RUNTIME : 0.13222s
	}

}
