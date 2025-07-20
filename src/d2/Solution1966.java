package d2;

import java.util.Arrays;
import java.util.Scanner;

//�־��� N������ ���ڿ��� ������������ �����Ͽ� ���
public class Solution1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();

			int nums[] = new int[N];

			for (int i = 0; i < N; i++) {
				nums[i] = sc.nextInt();
			}

			Arrays.sort(nums);

			System.out.printf("#%d ", t);
			for (int i : nums) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
