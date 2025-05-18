package d1;

import java.util.Scanner;

//하나의 자연수를 입력 받아 각 자릿수의 합 계산
public class Solution2058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		1) 나눗셈 활용
		int N = sc.nextInt();
		int sum = 0;

		while (N > 0) {
			sum += N % 10;
			N /= 10;
		}
		
		System.out.println(sum);

//		2) 문자열 활용
//		int N = sc.nextInt();
//		String s = String.valueOf(N);
//		int sum = 0;
//
//		for (int i = 0; i < s.length(); i++) {
//			sum += s.charAt(i) - '0';
//		}
//
//		System.out.println(sum);

		sc.close();
	}
}