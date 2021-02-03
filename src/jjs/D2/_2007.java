package jjs.D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2007 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/D2/_2007.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			String str = scanner.nextLine().trim();
			
			String firstSpelling = "";
			int nextSpellingIndex = 0;
			int wordLength = 0;
			String firstWord = "";
			String secondWord = "";
			boolean same = false;
			
			do {
				// 첫 스펠링을 이용
				firstSpelling = str.substring(0, 1);
				
				// 첫 스펠링의 다음 인덱스 검색
				nextSpellingIndex = str.indexOf(firstSpelling, 1+wordLength);
				
				// 첫 번째 추론
				firstWord = str.substring(0, nextSpellingIndex);
				
				// 첫 번째로 추론된 단어의 길이
				wordLength = firstWord.length();
				
				// 두 번째 추론
				secondWord = str.substring(nextSpellingIndex, nextSpellingIndex+wordLength);
				
				// 비교
				same = firstWord.equals(secondWord);
				
				if(same) {
					System.out.println("#"+(i+1) + " " + firstWord.length());
				} 
				
			} while(same == false);
		}
		
		// RUNTIME : 0.12302s
	}
}
