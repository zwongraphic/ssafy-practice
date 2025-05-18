package d1;

import java.util.Scanner;

//주어진 숫자만큼 # 출력
public class Solution2046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i=0;i<num;i++) {
			System.out.print("#");
		}
		
		sc.close();

	}

}
