package d2;

import java.util.Scanner;

//N*N 단어 퍼즐에서 K 길이의 단어가 들어갈 수 있는 경우의 수 
public class Solution1979 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int puzzle[][] = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					puzzle[i][j] = sc.nextInt();
				}
			}

			int count = 0;

			for (int i = 0; i < N; i++) {
				int seq = 0;
				for (int j = 0; j < N; j++) {
					if (puzzle[i][j] == 1) {
						seq++;
					} else {
						if (seq == K) {
							count++;
						}
							seq = 0;
					}
				}
				if (seq == K) {
					count++;
				}
			}

			for (int i = 0; i < N; i++) {
				int seq = 0;
				for (int j = 0; j < N; j++) {
					if (puzzle[j][i] == 1) {
						seq++;
					} else {
						if (seq == K) {
							count++;
						}
						seq = 0;
					}
				}
				if (seq == K) {
					count++;
				}
			}

			System.out.printf("#%d %d\n", t, count);
		}

		sc.close();
	}

}
