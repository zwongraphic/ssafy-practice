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

			// A[N]에서 하나의 원소 제외한 a[N] 생성
			// 여기서 수열 A[i] 값을 냅다 0으로 바꾸려고 하면 안 됐는데..
			for (int i = 0; i < A.length; i++) {
				int aindex = 0;
				for (int j = 0; j < A.length; j++) {
					if (A[j] != A[i]) {
						a[aindex++] = A[j];
					}
				}

				// 거리 계산
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
			//그리고 aindex랑 disindex 구분해서 써야 했음

			Arrays.sort(distances);
			System.out.printf("#%d %d\n", t, distances[0]);
		}

		sc.close();
	}
}