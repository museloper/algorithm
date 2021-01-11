package ljh.D1;

import java.util.Scanner;

public class _2056 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = Integer.parseInt(sc.nextLine().trim());
		
		for (int i = 0; i < testCase; i++) {
			
			String yyyyMMdd = sc.nextLine();
			
			if (yyyyMMdd.length() == 8) {
				
				String yyyy = yyyyMMdd.substring(0, 4);
				
				String mm = yyyyMMdd.substring(4, 6);
				
				String dd = yyyyMMdd.substring(6);
				
				boolean isBoolean = false;
				
				switch(mm) {
				case "01" : 
					for (int j = 1; j <= 31; j++) {
						if (j == Integer.parseInt(dd)) {
							isBoolean = true;
						}
					}
					break;
				case "02" :
					for (int j = 1; j <= 28; j++) {
						if (j == Integer.parseInt(dd)) {
							isBoolean = true;
						}
					}
					break;
				case "03" :
					for (int j = 1; j <= 31; j++) {
						if (j == Integer.parseInt(dd)) {
							isBoolean = true;
						}
					}
					break;
				case "04" :
					for (int j = 1; j <= 30; j++) {
						if (j == Integer.parseInt(dd)) {
							isBoolean = true;
						}
					}
					break;
				case "05" :
					for (int j = 1; j <= 31; j++) {
						if (j == Integer.parseInt(dd)) {
							isBoolean = true;
						}
					}
					break;
				case "06" :
					for (int j = 1; j <= 30; j++) {
						if (j == Integer.parseInt(dd)) {
							isBoolean = true;
						}
					}
					break;
				case "07" :
					for (int j = 1; j <= 31; j++) {
						if (j == Integer.parseInt(dd)) {
							isBoolean = true;
						}
					}
					break;
				case "08" :
					for (int j = 1; j <= 31; j++) {
						if (j == Integer.parseInt(dd)) {
							isBoolean = true;
						}
					}
					break;
				case "09" :
					for (int j = 1; j <= 30; j++) {
						if (j == Integer.parseInt(dd)) {
							isBoolean = true;
						}
					}
					break;
				case "10" :
					for (int j = 1; j <= 31; j++) {
						if (j == Integer.parseInt(dd)) {
							isBoolean = true;
						}
					}
					break;
				case "11" :
					for (int j = 1; j <= 30; j++) {
						if (j == Integer.parseInt(dd)) {
							isBoolean = true;
						}
					}
					break;
				case "12" :
					for (int j = 1; j <= 31; j++) {
						if (j == Integer.parseInt(dd)) {
							isBoolean = true;
						}
					}
					break;
				}
				
				if (isBoolean) {
					System.out.println("#" + (i+1) + " " + yyyy + "/" + mm + "/" + dd);
				}
				else {
					System.out.println("#" + (i+1) + " -1");
				}
			}
			
		}
		
	}

}
