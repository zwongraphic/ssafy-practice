package d2;

import java.util.Scanner;

//문자 패턴에서 반복되는 부분인 마디의 길이 출력
public class Solution2007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		String str = sc.nextLine();

		for (int t = 1; t <= T; t++) {
			str = sc.nextLine();

			for (int len = 1; len <= 10; len++) {
				String pattern = str.substring(0, len);
				String next = str.substring(len, len * 2);

				if (pattern.equals(next)) {
					System.out.printf("#%d %d\n", t, len);
					break; //마디 찾은 후에는 break 해줘야겠다
				}
			}

		}

		sc.close();
	}

}
