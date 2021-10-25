package kadai;

public class Book1 {
	
	String bookTitle;	//タイトル
	String bookAuthoe;	//作者名
	int stockCount;		//在庫数
	
	void  setBook(String title) {
		this.bookTitle = title;
		this.bookAuthoe  = "不明";
		this.stockCount = 0;
	}
	
	void  setBook(String title, String aut) {
		this.bookTitle = title;
		this.bookAuthoe  = aut;
		this.stockCount = 0;
	}
	
	void  setBook(String title, String aut, int sc) {
		this.bookTitle = title;
		this.bookAuthoe  = aut;
		this.stockCount = sc;
	}
	
	void disp() {
		System.out.println("タイトル：" + bookTitle);
		System.out.println("作者：" + bookAuthoe);
		System.out.println("在庫数量：" + stockCount);
		
		
		
	}

}
