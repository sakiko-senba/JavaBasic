package jp.kenschool;

public class CallThresdTest {

	public static void main(String[] args) {
		
		System.out.println("Thread Start");
		ThreadTest thresdTest = new ThreadTest();
		//ThreadTest.start();
		
		try {
		thresdTest.join();
		}catch(InterruptedException e) {}
		
		
		System.out.println("Thread End");
		
	}

}
