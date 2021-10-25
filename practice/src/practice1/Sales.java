package practice1;

public class Sales extends Employee {
	//担当地域名
	private String area;

	public Sales(int id, String name, String erea) {
		super(id, name);
		this.area = erea;

	}

	public String getEres() {
		return this.area;
	}

	@Override
	public void display() {

		System.out.print("従業員番号：" + getId() );
		System.out.print(" 従業員名:" + getName());
		System.out.print(" 担当地域名：" + this.area);
		System.out.println("");
	}

}
