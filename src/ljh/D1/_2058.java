package ljh.D1;

import java.util.Scanner;

public class _2058 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		
		int total = 0;
		
		for (int i = 0; i < num.length(); i++) {
			
			total += Integer.parseInt(num.substring(i, i+1)); 
		}
		
		System.out.println(total);
		
	}

}
