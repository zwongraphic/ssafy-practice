package d1;

import java.util.Scanner;

//1부터 주어진 숫자만큼 모두 더한 값
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
