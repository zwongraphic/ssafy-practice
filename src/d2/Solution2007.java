package d2;

import java.util.Scanner;

//���� ���Ͽ��� �ݺ��Ǵ� �κ��� ������ ���� ���
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
					break; //���� ã�� �Ŀ��� break ����߰ڴ�
				}
			}

		}

		sc.close();
	}

}
