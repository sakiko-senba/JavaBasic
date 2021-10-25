package tosho;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tosho {

	public static void main(String[] args) {

		//西暦の下２桁をシステムから算出する
		LocalDateTime ldt = LocalDateTime.now();//現在の日時を取得
		System.out.println( ldt );
		
		//ldtの日付文字列から２１をとりだすには？
		String str = ldt.toString();
		System.out.println(str.substring(1,4));
		
		
		
		//21を出力する
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy");
		System.out.println(LocalDateTime.now().format(dtf));

		//ユーザーを一人作る
		User user1 = new User("LocalDateTime.now().format(dtf) + 001", "佐藤健一", "さとうけんいち", "愛媛県松山市", "089-111-1234");

		//Bookwo一冊作る
		Book book1 = new Book("01001", "空の不思議がよくわかる", "荒木健太郎", " KADOKAWA");

		//利用者カードのIDを読み込む

		//番号がないとき

		//貸出可能冊数を確認する

		//書籍コードを読み取る

		//

		//書籍コードを調べる

		//書籍コードを伝える

		//コードがないとき

		//貸出冊数が5冊を超えたとき

	}

}
