package d1;

import java.util.Scanner;

//A�� B �� ���� ������������ �̰���� �Ǻ� (����1, ����2, ��3)
public class Solution1936 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > B) {
			System.out.print("A");
		} else {
			System.out.print("B");
		}

		sc.close();
	}

}
