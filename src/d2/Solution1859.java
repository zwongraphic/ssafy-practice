package d2;

import java.util.Scanner;

//N일의 매매가를 아는 상태에서 최대 이익 출력
public class Solution1859 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int prices[] = new int[N];

			for (int i = 0; i < N; i++) {
				prices[i] = sc.nextInt();
			}
			
			int max = 0;
			long profit = 0;
			for (int i = N - 1; i >= 0; i--) {
				if (prices[i] >= max) {
					max = prices[i];
				} else {
					profit += max - prices[i];
				}
			}
			
			System.out.printf("#%d %d\n", t, profit);

		}

		sc.close();
	}

}
