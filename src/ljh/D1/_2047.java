package ljh.D1;

import java.util.Scanner;

public class _2047 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		
		int charInt = 0;
		
		String print = "";
		
		for (int i = 0; i < text.length(); i++) {
			charInt = (int)text.charAt(i);
			
			if (97 <= charInt && 122 >= charInt) {
				print += (char)(charInt - 32 );
			}
			else {
				print += new Character((char)charInt).toString();
			}
		}
		
		System.out.println(print);
	}

}
