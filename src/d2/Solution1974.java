package d2;

import java.util.Arrays;
import java.util.Scanner;

//스도쿠 성공 여부 판단
public class Solution1974 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			int N = 9;
			int puzzle[][] = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					puzzle[i][j] = sc.nextInt();
				}
			}

			int sudoku = 1;

			for (int i = 0; i < N; i++) {
				int row[] = new int[N];

				for (int j = 0; j < N; j++) {
					row[j] = puzzle[i][j];
				}

				Arrays.sort(row);

				for (int j = 0; j < N; j++) {
					if (row[j] != num[j]) {
						sudoku = 0;
						break;
					}
				}
			}

			for (int i = 0; i < N; i++) {
				int row[] = new int[N];

				for (int j = 0; j < N; j++) {
					row[j] = puzzle[j][i];
				}

				Arrays.sort(row);

				for (int j = 0; j < N; j++) {
					if (row[j] != num[j]) {
						sudoku = 0;
						break;
					}
				}
			}

			for (int i = 0; i < 9; i++) {
				int row[] = new int[N];
				int index = 0;

				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						row[index++] = puzzle[j][k];
					}
				}
				
				Arrays.sort(row);

				for (int j = 0; j < N; j++) {
					if (row[j] != num[j]) {
						sudoku = 0;
						break;
					}
				}
			}

			System.out.printf("#%d %d\n", t, sudoku);
		}

		sc.close();
	}

}
