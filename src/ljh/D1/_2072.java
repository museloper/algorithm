package ljh.D1;

import java.util.Scanner;

public class _2072 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lineCnt = Integer.parseInt(sc.nextLine());
		
		int totalCnt = 0;
		
		String arr[];
		
		for(int i = 0; i < lineCnt; i++) {

			arr = sc.nextLine().split(" ");
			
			for(int j = 0; j < arr.length; j++) {
				
				int arrNum = Integer.parseInt(arr[j]);
				
				int mod = arrNum % 2;
				
				if (mod > 0) {
					totalCnt += arrNum;
				}
				
			}
			
			System.out.println("#" + (i+1) + " " + totalCnt);
			
			totalCnt = 0;
			
		}
	}

}