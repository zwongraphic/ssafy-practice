package d1;

import java.util.Scanner;

//10개의 수를 입력받아, 그 중 가장 큰 수 출력
public class solution2068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t=1;t<=T;t++) {
			int max = 0;
			for (int i=0;i<10;i++) {
				int num = sc.nextInt();
				if (num > max) {
					max = num;
				}
			}
			System.out.printf("#%d %d\n", t, max);
		}
		sc.close();
	}
}
