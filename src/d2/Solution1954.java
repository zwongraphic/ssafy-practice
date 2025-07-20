package d2;

import java.util.Scanner;

//빙글빙글 돌아가는 숫자 배열
public class Solution1954 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[][] snail = new int[N][N];

			int[] dx = { 0, 1, 0, -1 };
			int[] dy = { 1, 0, -1, 0 };

			int x = 0;
			int y = 0;
			int dir = 0;

			for (int i = 1; i <= N * N; i++) {
				snail[x][y] = i;
				int nx = x + dx[dir];
				int ny = y + dy[dir];

				if (nx < 0 || ny < 0 || nx >= N || ny >= N || snail[nx][ny] != 0) {
					dir = (dir + 1) % 4;
					nx = x + dx[dir];
					ny = y + dy[dir];
				}

				x = nx;
				y = ny;
			}

			System.out.printf("#%d\n", t);
			for (int i = 0; i < N; i++) {
				for (int j =0;j<N;j++) {
					System.out.print(snail[i][j]+ " ");
				}
				System.out.println();
			}
		}

		sc.close();
	}

}
