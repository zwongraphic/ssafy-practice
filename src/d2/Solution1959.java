package d2;

import java.util.Scanner;

//�� ���� ���ڿ��� �� ���� ���� �� ���� ���� �ִ�
public class Solution1959 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int A[] = new int[N];
			int B[] = new int[M];

			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}

			for (int i = 0; i < M; i++) {
				B[i] = sc.nextInt();
			}

			int max = 0;

			if (N <= M) {
				for (int i = 0; i < M - N + 1; i++) {
					int sum = 0;
					for (int j = 0; j < N; j++) {
						sum += A[j] * B[i + j];
					}
					max = Math.max(max, sum);
				}
			} else {
				for (int i = 0; i < N - M + 1; i++) {
					int sum = 0;
					for (int j = 0; j < M; j++) {
						sum += A[i + j] * B[j];
					}
					max = Math.max(max, sum);
				}
			}

			System.out.printf("#%d %d\n", t, max);

		}
		sc.close();
	}

}
