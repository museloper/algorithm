package ljh.D1;

import java.util.Scanner;

public class _2063 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = Integer.parseInt(sc.nextLine().trim());
		
		int[] arrInt = new int[testCase];
		
		int tempVal = 0;
		
		String[] arrString = sc.nextLine().split(" ");
		
		for (int i = 0; i < testCase; i++) {
			arrInt[i] = Integer.parseInt(arrString[i]);
		}
		
		for (int i = 0; i < arrInt.length; i++) {
			
			for (int j = 0; j < arrInt.length - i - 1; j++) {
				
				if (arrInt[j] > arrInt[j+1]) {
					tempVal = arrInt[j+1];
					arrInt[j+1] = arrInt[j];
					arrInt[j] = tempVal;
				}
			}
		}
		
		System.out.println(arrInt[arrInt.length / 2]);
		
	}

}
