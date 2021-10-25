package java_basic;

public class AnException {

	public static void main(String[] args) {
		try {
			int[] test;
			test = new int[5];
			test[5] = 80;
			System.out.println("test[5]に80を代入");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("配列の要素をこえています" + e);
			e.printStackTrace();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.err.print("例外が発生したのでプログラムを終了します");
			
			
		}finally {
			System.err.println("例外が発生したのでプログラムを終了します");
			System.exit(-1);
		}
		
		System.out.println("正常終了");
	}

}
