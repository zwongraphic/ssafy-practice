package d1;

import java.util.Scanner;

//알파벳으로 이루어진 문자열을 받아 각 알파벳을 1부터 26까지의 숫자로 변환하여 출력
public class Solution2050 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int num = c - 'A' + 1;
			System.out.printf("%d ", num);
		}

		sc.close();

	}
}
