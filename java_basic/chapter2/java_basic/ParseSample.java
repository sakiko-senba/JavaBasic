package java_basic;

public class ParseSample {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		double dScore = Double.parseDouble(args[1]);
		
		if (dScore >= 80) {
			System.out.println("合格です");
		} else {
			System.out.println("不合格です");
		}
		
		String str = String.valueOf(score);
		System.out.println(str);

	}

}
