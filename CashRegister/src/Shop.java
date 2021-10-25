
public class Shop {

	private int shopNo; //店舗No
	private String shopName; //店舗名
	private String shopAddress; //住所
	private String shopTel; //TEＬ
	private int shopSales; // 店舗売上
	private int shopSalesTax; // 売上消費税

	public Shop(int shopNo, String shopName, String shopAddress, String shopTel) {
		super();
		this.shopNo = shopNo;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopTel = shopTel;

	}

	public void addShopSales(int sales) {
		this.shopSales += sales;
	}

	public void addSalesTax(int tax) {
		this.shopSalesTax += tax;
	}

	public int getShopSalesTax() {
		return shopSalesTax;
	}

	public void setShopSalesTax(int shopSalesTax) {
		this.shopSalesTax = shopSalesTax;
	}


	public int getShopNo() {
		return shopNo;
	}

	public void setShopNo(int shopNo) {
		this.shopNo = shopNo;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddress() {
		return shopAddress;
	}

	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}

	public String getShopTel() {
		return shopTel;
	}

	public void setShopTel(String shopTel) {
		this.shopTel = shopTel;
	}

	public int getShopSales() {
		return shopSales;
	}

	public void setShopSales(int shopSales) {
		this.shopSales = shopSales;
	}

}
