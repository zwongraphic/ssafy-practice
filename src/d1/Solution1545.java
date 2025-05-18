package d1;

import java.util.Scanner;

//주어진 숫자부터 0까지 순서대로 출력
public class Solution1545 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = N; i >= 0; i--) {
			System.out.print(i + " ");
		}

		sc.close();

	}

}
