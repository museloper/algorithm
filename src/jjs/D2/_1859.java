package jjs.D2;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1859 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1859.txt"));
		
		scanner = new Scanner(System.in);
		
		int outterTestCase = Integer.parseInt(scanner.next().trim());
		
		for(int i=0; i<outterTestCase; i++) {
			
			int innerTestCase = Integer.parseInt(scanner.next().trim());
			
			int[] numArr = new int[innerTestCase];
			
			for(int j=0; j<innerTestCase; j++) {
 				numArr[j] = (Integer.parseInt(scanner.next().trim()));
			}
			
			int maxValue;
			int sellPoint = 0;
			int entryPoint = 0;
			int process = 0;
			
			long buy = 0;
			long sell = 0;
			
			int buyCnt = 0;

 			while(process < numArr.length-1) {
				
				// 최대값 초기화
 				maxValue = 0;
				
				// 최대값 찾기
 				for(int m=entryPoint; m<numArr.length; m++) {
 					if(numArr[m] > maxValue) {
 						maxValue = numArr[m];
 						
 						sellPoint = m;
 						process = m;
					}
				}
 				
 				if(entryPoint == sellPoint) {
 					++entryPoint;
 					continue;
 				}
				
				// 구매
 				for(int b=entryPoint; b<sellPoint; b++) {
					buy += numArr[b];
					++buyCnt;
				}
				
				// 판매
				sell += numArr[sellPoint] * buyCnt;
				buyCnt = 0;
				entryPoint = sellPoint+1;
			}
			
			
			System.out.println("#"+(i+1) + " " + (sell-buy));
		
			// RUNTIME : 0.12118s
		}
	}

}
