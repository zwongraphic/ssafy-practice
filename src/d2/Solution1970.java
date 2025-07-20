package d2;

import java.util.Scanner;

//거스름돈 N원을 최소 돈의 개수로 거슬러주는 방법
public class Solution1970 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int money = sc.nextInt();

			int fiftythousand = money / 50000;
			money %= 50000;
			int tenthousand = money / 10000;
			money %= 10000;
			int fivethousand = money / 5000;
			money %= 5000;
			int onethousand = money / 1000;
			money %= 1000;
			int fivehundred = money / 500;
			money %= 500;
			int onehundred = money / 100;
			money %= 100;
			int fifty = money / 50;
			money %= 50;
			int ten = money / 10;
			
			System.out.printf(
					"#%d %d %d %d %d %d %d %d %d\n", 
					t, fiftythousand, tenthousand, fivethousand, onethousand,
					fivehundred, onehundred, fifty, ten);
		}

		sc.close();
	}

}
