package jp.kenscool.chapter4;

public class ExtendsMain {

	public static void main(String[] args) {
		Taxi taxi1 = new Taxi();
		Taxi taxi2 = new Taxi();
		Car car1 = new Car();
		Car car2 = new Car();

		//ポリモーフィズムの例
		Car[] cars = new Car[4];
		//cars[0] = taxi1;
		cars[1] = car1;
		//cars[2] = taxi2;
		cars[3] = car2;

		for (Car c : cars) {
			c.run();
		}

		//スーパークラスから継承したメソッド
		//taxi.setData(4, 60);
		//taxi.disp();

		//サブクラスで定義したメソッド
		//taxi.setFare(1000);
		//taxi.dispFare();

		//スーパークラスから継承したメソッド
		//taxi.run();

	}

}
