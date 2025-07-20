package d2;

import java.util.Scanner;

//N*N 행렬 90도, 180도, 270도 회전
public class Solution1961 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int matrix[][] = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}

			int matrix90[][] = new int[N][N];
			int matrix180[][] = new int[N][N];
			int matrix270[][] = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					matrix90[i][j] = matrix[N - 1 - j][i];
					matrix180[i][j] = matrix[N - 1 - i][N - 1 - j];
					matrix270[i][j] = matrix[j][N - 1 - i];
				}
			}

			System.out.printf("#%d\n", t);
			for (int i = 0; i < N; i++) {
				StringBuilder sb90 = new StringBuilder();
				StringBuilder sb180 = new StringBuilder();
				StringBuilder sb270 = new StringBuilder();

				for (int j = 0; j < N; j++) {
					sb90.append(matrix90[i][j]);
					sb180.append(matrix180[i][j]);
					sb270.append(matrix270[i][j]);
				}
				
				System.out.print(sb90 + " " + sb180 + " " + sb270 + "\n");
			}
		}

		sc.close();
	}

}
