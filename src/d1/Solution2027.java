package d1;

//�밢��(#) ����ϱ� (�ƴ� �κ� +)
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
		
//		for-each������ ������ �迭 ��� ����
//		for (char[] row : c) {
//			for (char val : row) {
//				System.out.print(val);
//			}
//			System.out.println();
//		}
	}

}
