package d1;

import java.util.Scanner;

//�ϳ��� �ڿ����� �Է� �޾� �� �ڸ����� �� ���
public class Solution2058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		1) ������ Ȱ��
		int N = sc.nextInt();
		int sum = 0;

		while (N > 0) {
			sum += N % 10;
			N /= 10;
		}
		
		System.out.println(sum);

//		2) ���ڿ� Ȱ��
//		int N = sc.nextInt();
//		String s = String.valueOf(N);
//		int sum = 0;
//
//		for (int i = 0; i < s.length(); i++) {
//			sum += s.charAt(i) - '0';
//		}
//
//		System.out.println(sum);

		sc.close();
	}
}