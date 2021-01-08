package jjs.D1;

import java.io.FileInputStream;
import java.util.Scanner;

public class _2056 {
	
	private static Scanner scanner;

	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input/_2056.txt"));

		scanner = new Scanner(System.in);
		
		int testCase = Integer.parseInt(scanner.nextLine().trim());

		for(int i=0; i<testCase; i++) {
			
			String data = scanner.nextLine();
			
			String year = data.substring(0, 4);
			String month = data.substring(4, 6);
			String day = data.substring(6, 8);
			
			String cal = "";
			
			switch(month) {
				case "01": 
				case "03":
				case "05":
				case "07":
				case "08":
				case "10":
				case "12":
					if(Integer.parseInt(day) > 31) {
						cal = "-1";
						break;
					} else {
						cal = year + "/" + month + "/" + day;
						break;
					}
					
				case "04":
				case "06":
				case "09":
				case "11":
					if(Integer.parseInt(day) > 30) {
						cal = "-1";
						break;
					} else {
						cal = year + "/" + month + "/" + day;
						break;
					}
					
				case "02":
					if(Integer.parseInt(year) % 4 == 0) {
						if(Integer.parseInt(day) > 29) {
							cal = "-1";
							break;
						}else {
							cal = year + "/" + month + "/" + day;
							break;
						}
						
					} else {
						if(Integer.parseInt(day) > 28) {
							cal = "-1";
							break;
						} else {
							cal = year + "/" + month + "/" + day;
							break;
						}
					}
				default:
					cal = "-1";
			}
			
			System.out.println("#"+(i+1) + " " + cal);
			
			// RUNTIME : 0.12981s
		}
	}

}
