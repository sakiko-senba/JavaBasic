package kadai;

public class Vending {

	String goodsName;
	int goodsPrice;
	int payment;

	void setGoodName(String name) {
		goodsName = name;
	}

	void setGoodsPrice(int price) {
		goodsPrice = price;

	}

	void setPayment(int money) {
		payment = money;

	}

	void disp() {
		System.out.println("GoodsName :" + goodsName);
		System.out.println("GoodsPrice :" + goodsPrice);
		System.out.println("payment :" + payment);
	}

}



class VendUser {
	public static void main(String[] args) {
		Vending book = new Vending();
		book.goodsName = "Coffee";
		book.goodsPrice = 130;
		book.payment = 200;

		book.disp();

	}

}
