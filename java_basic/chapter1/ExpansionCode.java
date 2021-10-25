
public class ExpansionCode {

	public static void main(String[] args) {

		int iValue = 10;
		double dValue;
		dValue = iValue;
		System.out.println("拡大変換　: int型の" + iValue + "から、double型の" + dValue);

		double ans = 10 * 2.5;
		System.out.println("計算結果は:" + ans + "です。");

		byte bValue;
		bValue = 10;
		bValue = (byte) 500;

		System.out.println(bValue);

		iValue = 20;
		bValue = (byte) iValue;
		System.out.println(bValue);

	}

}
