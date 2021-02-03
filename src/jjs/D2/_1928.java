package jjs.D2;

import java.io.FileInputStream;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Scanner;

public class _1928 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D2/_1928.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			String str = scanner.nextLine().trim();

			Decoder decoder = Base64.getDecoder();
			
			byte[] ascii = decoder.decode(str);
			
			System.out.print("#"+(i+1) + " ");
			for(byte output : ascii) {
				System.out.print((char)output);
			}
			System.out.println();
		}
		
		// RUNTIME : 0.13073s
	}

}
