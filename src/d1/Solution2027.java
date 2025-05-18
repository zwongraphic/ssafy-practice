package d1;

//대각선(#) 출력하기 (아닌 부분 +)
public class Solution2027 {

	public static void main(String[] args) {

		char c[][] = new char[5][5];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (i == j) {
					c[i][j] = '#';
				} else {
					c[i][j] = '+';
				}
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
//		for-each문으로 이차원 배열 출력 가능
//		for (char[] row : c) {
//			for (char val : row) {
//				System.out.print(val);
//			}
//			System.out.println();
//		}
	}

}
