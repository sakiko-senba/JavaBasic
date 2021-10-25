package kadai;

public class Employee {

	int id; //社員ID
	String name;//社員名
	String dept;//所属名
	String tel; //内線番号

	Employee(int empid, String empname, String empdept, String emptel) {
		this.id = empid;
		this.name = empname;
		this.dept = empdept;
		this.tel = emptel;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;

	}

	String getDept() {
		return dept;

	}

	String getTel() {
		return tel;

	}

}
