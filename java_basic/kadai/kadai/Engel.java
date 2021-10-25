package kadai;

public class Engel {
	double food; //食費	
	double consumption; //消費支出
	String name; //氏名

	Engel() {
	}

	Engel(String ename) {
		this.name = ename;
	}

	void setFood(double efood) {
		this.food = efood;
	}

	void setConsumpion(double con) {
		this.consumption = con;
	}
	
	double calculation(){
		
		return (this.food / this.consumption)*100;
	}
	
	public void show() {
		System.out.println(this.name + "さんのエンゲル係数は" + calculation() + "%です");
	}
	
	public void explain() {
		System.out.println("第一引数：食費");
		System.out.println("第二引数：消費支出");
		System.out.println("第三引数：氏名");
	}
	

}
