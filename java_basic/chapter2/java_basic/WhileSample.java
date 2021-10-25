package java_basic;

public class WhileSample {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		//int g;

		while (i <= 100) {
			sum += i;
			i++;
		}

		System.out.println(sum);

		//Scanner sc = new Scanner(System.in);

		
		//999が入力されるまで繰り返す
		/*
		int num = 0;
		
		num = sc.nextInt();
		while(num != 999) {
			num = sc.nextInt();
		}
		
		//do～while文で書く方法
		num = 0;
		do {
			num = sc.nextInt();
		}while(num != 999);
		*/
		
		
		//for文 1～100までの合計値を求める

		sum = 0;

		for (i = 1; i <= 100; i++) {
			sum += i;
		
		System.out.println(sum);
	}

		//while文でも書ける
		sum = 0;
		int j = 1;
		while (j <= 100) {
			sum += j;
			j++;
		}
		System.out.println(sum);

	}

}
