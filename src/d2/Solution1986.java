package d2;

import java.util.Scanner;

//1���� N���� ���� �� Ȧ���� ���ϰ� ¦���� ���� �� ��
public class Solution1986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int n[] = new int[N + 1];
			int sum = 0;

			for (int i = 1; i < N + 1; i++) {
				n[i] = i;
				if (i % 2 == 1) {
					sum += i;
				} else {
					sum -= i;
				}
			}

			System.out.printf("#%d %d\n", t, sum);

		}

		sc.close();
	}

}
