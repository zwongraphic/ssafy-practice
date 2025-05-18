package d1;

import java.util.Scanner;

//주어지는 문자열의 알파벳 소문자를 전부 대문자로 바꾸기
public class Solution2047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String S = s.toUpperCase();

		System.out.print(S);
		
		sc.close();
	}

}
