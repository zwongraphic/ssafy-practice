package d1;

import java.util.Scanner;

//두 개의 자연수를 입력받아 사칙연산을 수행
public class Solution1938 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		sc.close();
	}

}
