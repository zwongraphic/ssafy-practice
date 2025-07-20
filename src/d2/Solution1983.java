package d2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//K번째 학생의 학점 출력
public class Solution1983 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			String[] grades = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };
			HashMap<Integer, Double> hashmap = new HashMap<>();
			double array[] = new double[N];

			for (int i = 0; i < N; i++) {
				int mid = sc.nextInt();
				int fin = sc.nextInt();
				int task = sc.nextInt();

				double sum = (mid * 0.35) + (fin * 0.45) + (task * 0.2);
				hashmap.put(i, sum);
				array[i] = sum;
			}

			Arrays.sort(array);
			for (int i = 0; i < N / 2; i++) {
				double temp = 0;
				temp = array[i];
				array[i] = array[array.length - i - 1];
				array[array.length - i - 1] = temp;
			}

			double targetScore = hashmap.get(K - 1);
			int rank = 0;
			for (int i = 0; i < N; i++) {
				if (array[i] == targetScore) {
					rank = i;
					break;
				}
			}

			rank = rank / (N / 10);
			System.out.printf("#%d %s\n", t, grades[rank]);
		}

		sc.close();
	}

}
