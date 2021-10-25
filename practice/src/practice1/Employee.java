package practice1;

public class Employee {

	private int id; //従業員番号
	private String name; //従業員名

	//フィールドidとnameを設定する
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}

	//フィールドidを返却します
	public int getId() {
		return id;
	}

	//フィールドnameを返却します
	public String getName() {
		return name;
	}

	//従業員番号を従業員名を表示します。従業員番号：○○　従業員名：□□
	public void display() {
		System.out.print("従業員番号：" + this.id );
		System.out.print(" 従業員名:" + this.name);

	}

}
