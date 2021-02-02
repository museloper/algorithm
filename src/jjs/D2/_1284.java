package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _1284 {

	private static Scanner scanner;
	
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1284.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			String[] str = scanner.nextLine().split(" ");
			
			int tax_a = Integer.parseInt(str[0]);
			int tax_b_in = Integer.parseInt(str[1]);
			int tax_b_out = Integer.parseInt(str[3]);
			int boundary = Integer.parseInt(str[2]);
			int usage = Integer.parseInt(str[4]);
			
			// 기본요금 청구시
			if(usage <= boundary) {
				if(tax_b_in < tax_a*usage) {
					System.out.println("#"+(i+1) + " " + tax_b_in);
				} else {
					System.out.println("#"+(i+1) + " " + tax_a*usage);
				}
			} 
			// 기본요금 초과시
			else {
				if( tax_b_in+(tax_b_out*(usage-boundary)) < tax_a*usage ) {
					System.out.println("#"+(i+1) + " " + (tax_b_in+(tax_b_out*(usage-boundary))));
				} else {
					System.out.println("#"+(i+1) + " " + tax_a*usage);
				}
			}
		}
		
		// RUNTIME : 0.11947s
	}

}
