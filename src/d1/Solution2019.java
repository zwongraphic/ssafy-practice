package d1;

import java.util.Scanner;

//1부터 주어진 횟수까지 2를 곱한 값들 출력 (2의 거듭제곱)
public class Solution2019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int res = 1;

		System.out.print(res + " ");
		for (int i = 1; i <= N; i++) {
			res *= 2;
			System.out.print(res + " ");
		}

		sc.close();
	}

}
