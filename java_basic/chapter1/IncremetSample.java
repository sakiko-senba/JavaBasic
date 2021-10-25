
public class IncremetSample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		int ans1, ans2;

		ans1 = num1++;
		ans2 = ++num2;

		System.out.println("num1 => " + num1);
		System.out.println("num2 => " + num2);
		System.out.println("ans1 => " + ans1);
		System.out.println("ans2 => " + ans2);

		int num3 = 10;
		int num4 = 10;

		System.out.println(num3 += 10);
		System.out.println(num4 -= 5);
		
		num4 -= 4;
		System.out.println(num4 /= 3);

		System.out.println ( 10 / 2);
		
	}

}
