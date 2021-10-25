package jp.kenschool;

public class RunnableTest implements Runnable {
	private int count;

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		count++;
		System.out.println("count =" + count);

	}

}
