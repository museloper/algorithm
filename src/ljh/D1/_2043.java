package ljh.D1;

import java.util.Scanner;

public class _2043 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[2];
		
		arr = sc.nextLine().split(" ");
		
		int p = Integer.parseInt(arr[0]);
		
		int k = Integer.parseInt(arr[1]);
		
		int cnt = 0;
		
		for (int i = k; i < p+1; i++) {
			if (i == p) {
				cnt++;
				break;
			}
			else {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
