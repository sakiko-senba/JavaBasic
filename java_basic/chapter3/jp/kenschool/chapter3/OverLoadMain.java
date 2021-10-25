package jp.kenschool.chapter3;

import java.util.Scanner;

public class OverLoadMain {

	public static void main(String[] args) {

		Shopping shop = new Shopping();

		Scanner sc = new Scanner(System.in);
		int quantety = sc.nextInt();

		if (quantety == 1) {
			shop.buy(300);
		} else if (quantety > 1) {
			shop.buy(300, 5);
		}

	}

}
