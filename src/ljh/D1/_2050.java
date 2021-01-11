package ljh.D1;

import java.util.Scanner;

public class _2050 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String alpha = sc.nextLine();
		
		String print = "";
		
		for (int i = 0; i < alpha.length(); i++) {
			String temp = alpha.substring(i, i+1);
			
			switch(temp) {
			case "A" :
				print += "1 ";
				break;
			case "B" : 
				print += "2 ";
				break;
			case "C" : 
				print += "3 ";
				break;
			case "D" : 
				print += "4 ";
				break;
			case "E" : 
				print += "5 ";
				break;
			case "F" : 
				print += "6 ";
				break;
			case "G" : 
				print += "7 ";
				break;
			case "H" : 
				print += "8 ";
				break;
			case "I" : 
				print += "9 ";
				break;
			case "J" : 
				print += "10 ";
				break;
			case "K" : 
				print += "11 ";
				break;
			case "L" : 
				print += "12 ";
				break;
			case "M" : 
				print += "13 ";
				break;
			case "N" : 
				print += "14 ";
				break;
			case "O" : 
				print += "15 ";
				break;
			case "P" : 
				print += "16 ";
				break;
			case "Q" : 
				print += "17 ";
				break;
			case "R" : 
				print += "18 ";
				break;
			case "S" : 
				print += "19 ";
				break;
			case "T" : 
				print += "20 ";
				break;
			case "U" : 
				print += "21 ";
				break;
			case "V" : 
				print += "22 ";
				break;
			case "W" : 
				print += "23 ";
				break;
			case "X" : 
				print += "24 ";
				break;
			case "Y" : 
				print += "25 ";
				break;
			case "Z" : 
				print += "26 ";
				break;
			}
		}
		
		print = print.trim();
		
		System.out.println(print);
		
	}

}
