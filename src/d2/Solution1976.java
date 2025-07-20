package d2;

import java.util.Scanner;

//시, 분으로 이루어진 시각 2개 더한 값 출력
public class Solution1976 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int hour1 = sc.nextInt();
			int min1 = sc.nextInt();
			int hour2 = sc.nextInt();
			int min2 = sc.nextInt();
			int hour = hour1 + hour2;
			int min = min1 + min2;

			if (min >= 60) {
				min -= 60;
				hour += 1;
			}

			if ((hour % 12) == 0) {
				hour = 12;
			} else {
				hour %= 12;
			}
			
			System.out.printf("#%d %d %d\n", t, hour, min);
		}

		sc.close();
	}

}
