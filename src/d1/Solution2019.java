package d1;

import java.util.Scanner;

//1���� �־��� Ƚ������ 2�� ���� ���� ��� (2�� �ŵ�����)
public class Solution2019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int res = 1;

		System.out.print(res + " ");
		for (int i = 1; i <= N; i++) {
			res *= 2;
			System.out.print(res + " ");
		}

		sc.close();
	}

}
