package tosho;

public class Book {

	private String bookId; //書籍コード
	private String title; //タイトル名
	private String auther; //著者名
	private String publisher; //出版社名

	public Book(String bookId, String title, String auther, String publisher) {
		this.bookId = bookId;
		this.title = title;
		this.auther = auther;
		this.publisher = publisher;
	}

	public void setbookId(String bookId) {
		this.bookId = bookId;
	}

	public String getbookId() {
		return this.bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
