package java_basic;

public class ScoreAverage {

	public static void main(String[] args) {

		int[] eng = { 80, 70, 100 };
		int[] jp = { 70, 80, 85 };
		int[] math = { 100, 90, 100 };

		//合計
		int engSum = 0;
		int jpSum = 0;
		int mathSum = 0;

		//英語
		for (int i = 0; i < eng.length; i++) {
			engSum = engSum + eng[i];
		}
		int engAve = engSum / eng.length;
		System.out.println("英語の平均点は" + engAve + "点です");

		//国語
		for (int i = 0; i < jp.length; i++) {
			jpSum += jp[i];
		}
		int jpAve = jpSum / jp.length;
		System.out.println("国語の平均点は" + jpAve + "点です");

		// math
		for (int i = 0; i < math.length; i++) {
			mathSum = mathSum + math[i];
		}
		System.out.println("数学の平均点は" + mathSum / math.length + "点です");

	}

}
