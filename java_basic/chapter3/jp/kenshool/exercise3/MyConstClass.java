package jp.kenshool.exercise3;

public class MyConstClass {

	private String expression;

	public MyConstClass(String tmp) {
		expression = tmp;
	}

	public String calcMethod(int a ,int b) {

		return expression + a * b;
	}

}
