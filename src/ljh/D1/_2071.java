package ljh.D1;

import java.util.Scanner;

public class _2071 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lineCnt = Integer.parseInt(sc.nextLine());
		
		double totalCnt = 0;
		
		double avgNum = 0;
		
		String arr[];
		
		for(int i = 0; i < lineCnt; i++) {

			arr = sc.nextLine().split(" ");
			
			for(int j = 0; j < arr.length; j++) {
				
				double arrNum = Double.parseDouble(arr[j]);
				
				totalCnt += arrNum;
				
				avgNum = totalCnt / arr.length;
				
			}
			
			System.out.println("#" + (i+1) + " " + Math.round(avgNum));
			
			totalCnt = 0;
			
		}
		
	}

}
