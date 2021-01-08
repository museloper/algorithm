package ljh.D1;

import java.util.Scanner;

public class _2070 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lineCnt = Integer.parseInt(sc.nextLine());

		String arr[];
		
		int[] arrNum = new int[2];
		
		String print = "";
		
		for (int i = 0; i < lineCnt; i++) {
			
			arr = sc.nextLine().split(" ");
			
			if (arr.length == 2) {
				
				for (int j = 0; j < arr.length; j++) {
					
					arrNum[j] = Integer.parseInt(arr[j]);
					
					if (j > 0) {
						if (arrNum[j-1] > arrNum[j]) {
							print = ">";
						}
						else if (arrNum[j-1] < arrNum[j]) {
							print = "<";
						}
						else if (arrNum[j-1] == arrNum[j]) {
							print = "=";
						}
					}
				}
				
				System.out.println("#" + (i+1) + " " + print);
			}
			
		}
		
	}

}
