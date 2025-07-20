package test;

import java.util.Arrays;
import java.util.Scanner;

class Solution2 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int A[] = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			
			int a[] = new int[A.length - 1];
			int distances[] = new int[A.length];

			// A[N]���� �ϳ��� ���� ������ a[N] ����
			// ���⼭ ���� A[i] ���� ���� 0���� �ٲٷ��� �ϸ� �� �ƴµ�..
			for (int i = 0; i < A.length; i++) {
				int aindex = 0;
				for (int j = 0; j < A.length; j++) {
					if (A[j] != A[i]) {
						a[aindex++] = A[j];
					}
				}

				// �Ÿ� ���
				int distance = 0;
				
				for (int j = 0; j < a.length - 1; j++) {
					if (a[j] > a[j + 1]) {
						distance += M - a[j] + a[j + 1];
					} else {
						distance += a[j + 1] - a[j];
					}
				}
				distances[i] = distance;
			}
			//�׸��� aindex�� disindex �����ؼ� ��� ����

			Arrays.sort(distances);
			System.out.printf("#%d %d\n", t, distances[0]);
		}

		sc.close();
	}
}