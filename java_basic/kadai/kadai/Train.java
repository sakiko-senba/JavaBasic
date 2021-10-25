package kadai;

public class Train {
	String name; //列車名
	int speed; //最高速度
	int free; //自由席の数

	Train(String tname, int tspeed, int tfree) {
		this.name = tname;
		this.speed = tspeed;
		this.free = tfree;
	}
	
	void show(){
		System.out.println("TrainName :" + name);
		System.out.println("MaaxSpeed :" + speed);
		System.out.println("FreeSeat :" + free);
		
	}

}
