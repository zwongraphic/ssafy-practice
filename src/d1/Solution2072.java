package d1;

import java.util.Scanner;

//10���� ���� �Է� �޾�, �� �߿��� Ȧ���� ���� �� ���
public class Solution2072 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int t = 1; t <= T; t++) {
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				int num = scanner.nextInt();
				if (num % 2 == 1) {
					sum += num;
				}
			}
			System.out.printf("#%d %d\n", t, sum);
		}

		scanner.close();
	}

}
