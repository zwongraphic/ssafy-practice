package d1;

import java.util.Scanner;

//2���� ���� �Է� �޾� ��� ������ ���
public class Solution2029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.printf("#%d %d %d\n", t, a/b, a%b);
		}

		sc.close();
	}

}
