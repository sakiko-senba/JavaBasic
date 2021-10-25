
class Sample1 {

	public static void main(String[] args) {

		int a = 10 + 20;

		System.out.println(a);
		System.out.println("初体験 Java");

		a = 100;
		System.out.println(a * 2);

		/*
		 * レシートの印字プログラム
		*/

		int okashi = 30;
		int yashai = 150;

		System.out.println("小計：\t\t\\" + (okashi + yashai));

		System.out.print("消費税:" + "\t");
		System.out.print("\\");
		System.out.println((okashi + yashai) * 0.1);

		System.out.print("合計:" + "\t");
		System.out.print("\\");
		System.out.println((okashi + yashai) * 1.1);

		System.out.print("合計:" + "\t" + "\\");
		System.out.println((okashi + yashai) + (okashi + yashai) * 0.1);

		// 終わり

		double d;
		d = 5;
		System.out.println(d);
		/*

		char c = 'Z';

		boolean b = true;
		boolean b2 = false;

		String s = "abcdef";
		
		*/
		
		
		



	}

}
