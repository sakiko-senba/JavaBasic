
public class Sample5 {

	public static void main(String[] args) {

		int score = 80;

		if (score <= 100) {
			if (score >= 80) {
				System.out.println("合格です");
			} else if (score >= 60) {
				System.out.println("補欠合格です");
			} else {
				System.out.println("不合格です");
			}
		} else {
			System.out.println("値の範囲が無効です");
		}

	}

}
