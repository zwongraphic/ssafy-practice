package d1;

import java.util.Scanner;

//2개의 수를 입력 받아 크기를 비교하여 등호 또는 부등호 출력
public class Solution2070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			char res = ' ';
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if (num1 > num2) {
				res = '>';
			} else if (num1 == num2) {
				res = '=';
			}else {
				res = '<';
			}
			
			System.out.printf("#%d %c\n", t, res);
		}

		sc.close();
	}

}
