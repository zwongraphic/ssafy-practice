package d2;

import java.util.Scanner;

//+= 연산을 반복해서 N 넘게 하기
public class Solution21425 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int N = sc.nextInt();
			int res = 0;
			int count = 0;

			while (res <= N) {
				count += 1;
				if (A >= B) {
					B += A;
					res = B;
				} else {
					A += B;
					res = A;
				}
			}
			
			System.out.println(count);
		}

		sc.close();
	}

}
