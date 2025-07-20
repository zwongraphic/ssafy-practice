package test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int P = sc.nextInt();
			int B = sc.nextInt();

			int A[] = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			Arrays.sort(A);

			// 이익 계산
			int profits[] = new int[A[N - 1] + 1];
			for (int i = 1; i <= A[N - 1] + 1; i++) {
				int profit = 0;
				for (int j = 0; j < N; j++) {
					if (A[j] >= i) {
						profit += i * B;
					} else {
						profit += P;
					}
				}
				profits[i - 1] = profit;
			}

			Arrays.sort(profits);
			System.out.printf("#%d %d\n", t, profits[profits.length - 1]);
		}

		sc.close();
	}

}
