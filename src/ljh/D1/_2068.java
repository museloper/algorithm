package ljh.D1;

import java.util.Scanner;

public class _2068 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = Integer.parseInt(sc.nextLine().trim());
		
		String arr[];
		
		String print = "";
		
		for (int i = 0; i < testCase; i++) {
			
			arr = sc.nextLine().split(" ");
			
			for (int j = 0; j < arr.length; j++) {
				
				boolean isBoolean = true;
				
				for (int h = 0; h < arr.length; h++) {
					
					if (j != h) {

						if (Integer.parseInt(arr[j]) < Integer.parseInt(arr[h])) {
							isBoolean = false;
							break;
						}
					}
				}
				
				if (isBoolean) {
					print = arr[j];
					break;
				}
			}
			
			System.out.println("#" + (i+1) + " " + print);
			
		}
		
	}

}
