package d1;

import java.util.Scanner;

//A와 B 중 누가 가위바위보를 이겼는지 판별 (가위1, 바위2, 보3)
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
