
public class Student {

	//フィールド
	String name; //名前
	char gender; //性別
	int score; //点数

	Student(String tmpName, char tmpGender, int tmpScore) {
		name = tmpName;
		gender = tmpGender;
		score = tmpScore;
	}

	//メソッド
	void disp() {
		char tmpRank = getRank(); //getRank()メソッドの呼び出し
		System.out.println("名前:" + name);
		System.out.println("性別:" + gender);
		System.out.println("点数:" + score);
		System.out.println("成績:" + tmpRank);
		System.out.println();
	}

	/*
		void input(String tmpName, char tmpGender, int tmpScore) {
			name = tmpName;
			gender = tmpGender;
			score = tmpScore;
		}
	*/
	char getRank() {
		char rank;

		if (score >= 80) {
			rank = 'A';
		} else if (score >= 60) {
			rank = 'B';
		} else if (score >= 40) {
			rank = 'C';
		} else {
			rank = 'X';
		}
		return rank;
	}

}
