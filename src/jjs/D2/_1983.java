package jjs.D2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class _1983 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input/_1983.txt"));
		
		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());
		
		for(int i=0; i<testCase; i++) {
			
			String[] set = scanner.nextLine().split(" ");
			
			// 전체 학생 수 
			int nop = Integer.parseInt(set[0]);
			// 원하는 학생의 인덱스
			int idx = Integer.parseInt(set[1]); // 1 <= idx <= nop
			
			// 반영된 점수를 담을 배열
			double[] totalPoint = new double[nop];
			
			for(int j=0; j<nop; j++) {
				
				String[] score = scanner.nextLine().split(" ");
				
				int midExam = Integer.parseInt(score[0]);
				int finExam = Integer.parseInt(score[1]);
				int task = Integer.parseInt(score[2]);
				
				totalPoint[j] = midExam*0.35 + finExam*0.45 + task*0.2;
			}
			
			// 원하는 학생의 점수
			double point = totalPoint[idx-1];
			
			// 오름차순 정렬
			Arrays.sort(totalPoint);
			
			// 원하는 학생이 어느 그룹에 존재하는지 판단하기 위한 잣대
			int spot = 0;
			
			for(int k=0; k<nop; k++) {
				
				if(totalPoint[k] == point) {
					spot = k / (nop/10);

					switch(spot) {
					case 0:
						System.out.println("#"+(i+1) + " " + "D0");
						break;
					case 1:
						System.out.println("#"+(i+1) + " " + "C-");
						break;
					case 2:
						System.out.println("#"+(i+1) + " " + "C0");
						break;
					case 3:
						System.out.println("#"+(i+1) + " " + "C+");
						break;
					case 4:
						System.out.println("#"+(i+1) + " " + "B-");
						break;
					case 5:
						System.out.println("#"+(i+1) + " " + "B0");
						break;
					case 6:
						System.out.println("#"+(i+1) + " " + "B+");
						break;
					case 7:
						System.out.println("#"+(i+1) + " " + "A-");
						break;
					case 8:
						System.out.println("#"+(i+1) + " " + "A0");
						break;
					case 9:
						System.out.println("#"+(i+1) + " " + "A+");
						break;
					}
				}
			}
		}
		
		// RUNTIME : 0.14218s
	}

}
