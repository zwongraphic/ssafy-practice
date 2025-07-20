package d2;

import java.util.Scanner;

//크기가 N인 파스칼의 삼각형
public class Solution2005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int triangle[][] = new int[N][N];

			for (int i = 0; i < N; i++) {
				triangle[i][0] = 1;
				for (int j = 1; j <= i; j++) {
					triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
				}
			}

			System.out.printf("#%d\n", t);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(triangle[i][j] + " ");
				}
				System.out.println();
			}
		}
		
		sc.close();
	}

}
