package kadai;

class Book {

	String title;
	String author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}



class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("Java ABC");
		book1.setAuthor("Yamada Taro");
		System.out.println("Title :" + book1.getTitle());
		System.out.println("Author :" + book1.getAuthor());

	}
}
