package d2;

import java.util.Scanner;

//문자열 회문(스위스,기러기 등)인지 체크
public class Solution1989 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			String str = sc.next();
			int strlen = str.length();
			int palindrome = 1;

			for (int i = 0; i < strlen / 2; i++) {
				if (str.charAt(i) != str.charAt(strlen - i - 1)) {
					palindrome = 0;
					break;
				}
			}

			System.out.printf("#%d %d\n", t, palindrome);
		}

		sc.close();
	}

}
