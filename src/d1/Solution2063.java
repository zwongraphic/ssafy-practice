package d1;

import java.util.Arrays;
import java.util.Scanner;

//N개의 점수가 주어졌을 때, 중간값 출력
public class Solution2063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] scores = new int[N];
		int mid = 0;

		for (int i = 0; i < N; i++) {
			int score = sc.nextInt();
			scores[i] = score;
		}
		
		Arrays.sort(scores);
		mid = scores[N/2];
		
		System.out.println(mid);
		
		sc.close();
	}
}
