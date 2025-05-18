package d1;

import java.util.Scanner;

//세 자리수 비밀번호를 주어진 번호부터 1씩 증가하며 확인할 때 몇 번 만에 비밀번호를 맞출 수 있는 지 확인
public class Solution2043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		int K = sc.nextInt();
		
		System.out.print(P-K+1);
		
		sc.close();

	}

}
