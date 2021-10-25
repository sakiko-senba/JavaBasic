package kadai;

public class Customer {

	int custNo; //顧客番号	
	String custName; //顧客名
	
	//Customer(int cus,String name){
	//	this.custNo = cus;
	//	this.custName = name;
	//}

	void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	void setCustName(String custName) {
		this.custName = custName;
	}

	int getCustNo() {
		return custNo;
	}

	String getCustName() {
		return custName;
	}

}
