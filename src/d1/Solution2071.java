package d1;

import java.util.Scanner;

//10���� ���� �Է� �޾�, ��հ� ��� (�Ҽ��� ù° �ڸ����� �ݿø��� ���� ���)
public class Solution2071 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for (int t = 1; t <= T; t++) {
			int sum = 0;
			double avg = 0;
			for (int i = 0; i < 10; i++) {
				int num = scanner.nextInt();
				sum += num;
			}
			avg = sum / 10.0;
			System.out.printf("#%d %.0f\n", t, avg);
		}

		scanner.close();
	}
}
