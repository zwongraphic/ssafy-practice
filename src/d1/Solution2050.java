package d1;

import java.util.Scanner;

//���ĺ����� �̷���� ���ڿ��� �޾� �� ���ĺ��� 1���� 26������ ���ڷ� ��ȯ�Ͽ� ���
public class Solution2050 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int num = c - 'A' + 1;
			System.out.printf("%d ", num);
		}

		sc.close();

	}
}
