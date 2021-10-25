package java_basic;

public class ArrayCode1 {

	public static void main(String[] args) {
		//int[] no =new int[3];
		/*
		no[0] = 1;
		no[1] = 5;
		no[2] = 2;
		*/
		
		int[] no = {1,6,5,8,2};
		int len = no.length;
		
		for(int i = 0; i< len; i++) {
			System.out.println((i+1) + "番のお客様、" + no[i] + "番の窓口へ");
		}
				
		System.out.println("現在のお客様は、" + len + "人です");
		
		
		

	}

}
