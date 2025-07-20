package d2;

import java.util.Arrays;
import java.util.Scanner;

//10개 수 입력 받아, 최대와 최소 제외한 나머지의 평균값
public class Solution1984 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int num[] = new int[10];

			for (int i = 0; i < 10; i++) {
				num[i] = sc.nextInt();
			}

			Arrays.sort(num);
			int sum = 0;
			double avg = 0;

			for (int i = 1; i < 9; i++) {
				sum += num[i];
			}
			avg = sum / (8.0);

			System.out.printf("#%d %.0f\n", t, avg);
		}

		sc.close();
	}

}
