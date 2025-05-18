package d1;

import java.util.Scanner;

//10개의 수를 입력 받아, 평균값 출력 (소수점 첫째 자리에서 반올림한 정수 출력)
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
