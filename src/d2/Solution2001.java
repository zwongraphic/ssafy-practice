package d2;

import java.util.Scanner;

//N*N배열 안 M*M크기의 파리채로 파리잡기
public class Solution2001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int N_N[][] = new int[N][N];

			// N*N 배열 요소 입력
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					N_N[i][j] = sc.nextInt();
				}
			}
			
			int max = 0;

			// 가능한 M*M 배열 위치 탐색
			for (int i = 0; i < N - M + 1; i++) {
				for (int j = 0; j < N - M + 1; j++) {
					int sum = 0;

					// M*M 영역 합 구하기
					for (int x = 0; x < M; x++) {
						for (int y = 0; y < M; y++) {
							sum += N_N[i+x][j+y];
						}
					}
					
					if (sum >= max) {
						max = sum;
					}
				}
			}
			
			System.out.printf("#%d %d\n", t, max);
		}

		sc.close();
	}

}
