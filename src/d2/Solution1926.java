package d2;

import java.util.Scanner;

//369 ∞‘¿”
public class Solution1926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1;i<=N;i++) {
			if (three_six_nine(i)==0) {
				System.out.print(i + " ");
			} else {
				for (int j=0;j<three_six_nine(i);j++) {
					System.out.print("-");
				}
				System.out.print(" ");
			}
		}

		sc.close();
	}
	
	public static int three_six_nine(int n) {
		int count = 0;
		
		String str = String.valueOf(n);
		for (char c : str.toCharArray()) {
			if (c=='3' || c=='6' || c=='9') {
				count++;
			}
		}
		return count;
	}

}
