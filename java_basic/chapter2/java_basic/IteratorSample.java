package java_basic;

public class IteratorSample {

	public static void main(String[] args) {
		String[] array = { "dog", "cat", "fish" };
		for (String str : array) {
			System.out.println("Kinds of pet : " + str);
		}
	}

}
