package d1;

import java.util.Scanner;

//1���� �־��� ���ڸ�ŭ ��� ���� ��
public class Solution2025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i=1;i<=num;i++) {
			sum += i;
		}
		
		System.out.print(sum);

		sc.close();
	}

}
