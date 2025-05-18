package d1;

import java.util.Scanner;

//8�ڸ� ��¥ �Է¹ް�, ��ȿ�ϸ� ��YYYY/MM/DD���������� ��� (��ȿ���� ������ -1���)
public class Solution2056 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			String date = sc.next();
			String year = date.substring(0, 4);
			String month = date.substring(4, 6);
			String day = date.substring(6, 8);
			boolean isValid = false;

			switch (Integer.parseInt(month)) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= 31) {
					isValid = true;
				}
				break;
					
			case 4:
			case 6:
			case 9:
			case 11:
				if (Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= 30) {
					isValid = true;
				}
				break;
			
			case 2:
				if (Integer.parseInt(day) >= 1 && Integer.parseInt(day) <=28) {
					isValid = true;
				}
				break;
			
			default:
				break;
			}
			
			if (isValid) {
				System.out.printf("#%d %s/%s/%s\n", t, year, month, day);
			} else {
				System.out.printf("#%d -1\n", t);
			}
		}
		
		//int month, int day �ݺ� ���Ǵϱ� ���� �����ؼ� �ᵵ ���� (�������� �����غ��� ��)
		//�迭�� if�� Ȱ���� �ϴ� ����� ���� (�� ����� �� ���� �� ������ ����)

		sc.close();
	}
}
