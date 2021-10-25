package java_basic;

public class ForPractice {

	public static void main(String[] args) {

		int sum = 0;

		
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//while文でも書ける
		sum = 0;
		int j = 1;
		while (j <= 100) {
			sum += j;
			j++;
		}
		System.out.println(sum);
		
		

		//1～100までの数値の中で３の倍数のみ表示する
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

		//9×9

		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.print(a * b + " ");
			}
			System.out.println();
		}

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				if (a <= b) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		for (int a = 5; a >= 1; a--) {
			for (int b = 5; b >= 1; b--)
				if (a <= b) {
					System.out.print("*");
				}
		}
		System.out.println();
	}

}
