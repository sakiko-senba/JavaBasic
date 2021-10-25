package java_basic;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {

		String strValue1 = "Java";
		Integer iValue = 100;
		Double dValue = 10.5;

		ArrayList array = new ArrayList();
		array.add(strValue1);
		array.add(iValue);
		array.add(dValue);

		System.out.println(array);
		System.out.println(array.get(2));
		System.out.println(array.size());
		
		
	
		
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

		
		
	}

}
