package kadai;

public class Average {

	public static void main(String[] args) {

		int len = args.length;
		if(len!=3) {
			System.out.println("３つの整数を入力してください");
			System.exit(1);
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
				double ave = (double)(a+b+c)/3;
		
		
		System.out.println("数学・国語・英語の点数を計算します。");
		System.out.println("数学の得点     :" + a);
		System.out.println("国語の得点     :" + b);
		System.out.println("英語の得点     :" + c);
		System.out.println("3教科の平均点  :" + ave);
		
	
		
	
		
	

		
		
		
		

	}

}
