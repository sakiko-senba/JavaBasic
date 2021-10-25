package jp.kenschool.chapter3;

public class Shopping {
	//引数1つ用
	public void buy(int price) {
		System.out.println("商品1つは：" + price + "円です。");
	}
	
	//引数2つ用
		public void buy(int price , int quantety) {
			System.out.println("商品"+ quantety +"つの合計は" + price *quantety + "円です。");
		}

		//public void buy(int price , int quantety,int discount) {
		//	System.out.println("商品"+ quantety +"つの合計は" + price *quantety + "円です。");
		}


