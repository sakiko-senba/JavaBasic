package kadai;

public class CDStock {

	private String[] artists = { "嵐", "EXILE", "AKB48", "ももいろクローバーZ", "BON JOVI", "2PM" };
	private String[] titles = { "Popcorn", "願いの塔", "1830m", "5TH DIMENSION", "What About Now", "LEGEND OF 2PM" };
	private long[] stocks = { 100, 150, 50, 200, 75, 30 };
	private String artist; //歌手名
	private String title; //アルバムタイトル
	private long stock; //在庫数

	boolean searchCD(String keyword) {
		for (int i = 0; i < artists.length; i++) {
			if (keyword != null) {
				if (artists[i].equals(keyword)) {
					setCD(i);
					return true;
				} else if (titles[i].equals(keyword)) {
					setCD(i);
					return true;
				}
			}
		}
		return false;
	}

	void setCD(int idx) {

		this.artist = artists[idx];
		this.title = titles[idx];
		this.stock = stocks[idx];

	}

	void disp() {

		System.out.println("アーティスト名：" + this.artist);
		System.out.println("アルバム名  ：" + this.title);
		System.out.println("在庫数    ：" + this.stock);
	}

}
