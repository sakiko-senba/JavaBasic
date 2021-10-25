import java.util.Scanner;

public class User {

	String userId; //ユーザーID
	String password; //パスワード
	int missCnt; //ログインを間違った回数

	//ログインする
	void login() {
		//ユーザー名とパスワードを入力する
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		String password = sc.next();
		
		

		//ユーザー名とパスワードを検索する＊一致しているか
		if (this.userId .equals(userName) && this.password .equals(password) ){
			System.out.println("ログイン成功");
			this.missCnt = 0;

		} else {
			//間違った回数を保存する
			this.missCnt++;
			//System.out.println("IDかパスワードが間違っています。再入力してください");
		}

		
		

		//３回間違ったかどうか確認する
		int missCnt = num();

		//３回間違っていたら、システムを終了する
		if(missCnt == 3) {
			System.out.println("３回間違ったためシステムを終了します");
			System.exit(-1);
			
		}
	}
	int num() {
		return this.missCnt;
	}
}

