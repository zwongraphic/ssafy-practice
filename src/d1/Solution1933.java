package d1;

import java.util.Scanner;

//입력받은 정수 N의 약수를 오름차순으로 정렬
public class Solution1933 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1;i<=N;i++) {
			if (N%i == 0) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}

}
