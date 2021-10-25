package kadai;

public class MaxValue {

	public static void main(String[] args) {

		int Max;
		Max = 0;
		int len = args.length;

		for (int i = 0; i < args.length; i++) {

			if (Max < Integer.parseInt(args[i])) {
				Max = Integer.parseInt(args[i]);
			}
		}
			System.out.println("最大値は" + Max + "です");

			if (len == 0) {
				System.out.println("数字を入力してください");
				System.exit(1);
			}

		}
	}



//int a = Integer.parseInt(args[0]);
//int b = Integer.parseInt(args[1]);
//int c = Integer.parseInt(args[2]);

//int a = Integer.parseInt(args[len]);

//for() {

//
//}
